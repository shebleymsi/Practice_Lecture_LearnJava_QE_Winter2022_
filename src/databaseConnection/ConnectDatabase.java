package databaseConnection;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class ConnectDatabase {


    // Secret.properties files
    // jdbc driver
    // jdbc url
    // jdbc userName
    // jdbc password
    // MySQl Query


    public static Connection connection = null;
    public static Statement statement = null;
    public static PreparedStatement preparedStatement = null;
    public static ResultSet resultSet = null;

    // Load properties file
    public static Properties loadProperties(String filePath) {
        Properties properties = new Properties();
        try {
            InputStream inputStream = new FileInputStream(filePath);
            try {
                properties.load(inputStream);
                inputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }

//    public static void main(String[] args) {
//        Properties properties= loadProperties("configProperty/Secret.properties");
//        System.out.println(properties.getProperty("username"));
//        System.out.println(properties.getProperty("password"));
//        System.out.println(properties.getProperty("MYSQLJDBC.driver"));
//        System.out.println(properties.getProperty("MYSQLJDBC.url"));
//    }


    public static Connection getDatabaseConnection() {
        Properties properties = loadProperties("configProperty/Secret.properties");
        String driverClass = properties.getProperty("MYSQLJDBC.driver");
        String url = properties.getProperty("MYSQLJDBC.url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        try {
            Class.forName(driverClass);
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database is connected");
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }


    public static void closeDatabaseConnection() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println("Connection not closed");
            throw new RuntimeException(e);
        }
    }

    public static List<String> getResultSetData(ResultSet resultSet, String columnName) throws SQLException {
        List<String> dataList = new ArrayList<>();
        while (resultSet.next()) {
            String itemName = resultSet.getString(columnName);
            dataList.add(itemName);
        }
        return dataList;
    }


    public static List<String> readDatabaseTableColumn(String tableName, String columnName) {
        List<String> data = new ArrayList<>();
        try {
            // Will create connection to DB
            ConnectDatabase.getDatabaseConnection();
            statement = connection.createStatement();
            String query = "select * from " + tableName;
            resultSet = statement.executeQuery(query);
            data = getResultSetData(resultSet, columnName);
            System.out.println("Data value : " + data);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return data;
    }


    public static void insertDataFromStringToTable(String arrayData, String tableName, String columnName) {
        // INSERT INTO tableName(columnName1,columnName2) VALUES ( '  Gilbert  '  , 'Kevin','M','Tool Design',33)
        getDatabaseConnection();
        try {
            preparedStatement = connection.prepareStatement("Insert into " + tableName + "(" + columnName + ") values(?)");
            preparedStatement.setString(1, arrayData);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void insertDataInMultipleColumn(String tableName, String columnName1, String columnName2, String data1, String data2) {
        getDatabaseConnection();
        try {
            preparedStatement = connection.prepareStatement("Insert into " + tableName + "(" + columnName1 + "," + columnName2 + ") values(?,?)");
            preparedStatement.setString(1, data1);
            preparedStatement.setString(2, data2);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void insertDataInMultipleColumnFromListString(String tableName, String columnName1, String columnName2, List<String> data1, List<String> data2) {
        getDatabaseConnection();
        try {
            preparedStatement = connection.prepareStatement("Insert into " + tableName + "(" + columnName1 + "," + columnName2 + ") values(?,?)");
            for (int i = 0; i < data1.size(); i++) {
                preparedStatement.setObject(1, data1.get(i));
                preparedStatement.setObject(2, data2.get(i));
                preparedStatement.executeUpdate();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<String> directDatabaseQueryExecution(String query, String columnName) throws Exception {
        List<String> data = new ArrayList<>();
        try {
            ConnectDatabase.getDatabaseConnection(); // will create connection to DB
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            data = getResultSetData(resultSet, columnName);
            System.out.println("Data value " + data);
            for (String dt : data) {
                System.out.println(dt);
            }
        } finally {
            closeDatabaseConnection();
        }
        return data;
    }

    public static void insertDataInColumnFromListString(List<String> data1, String tableName, String columnName) {
        getDatabaseConnection();
        try {
            preparedStatement = connection.prepareStatement("Drop Table If Exists `" + tableName + "`;");
            preparedStatement.executeUpdate();

            preparedStatement = connection.prepareStatement("Create table `" + tableName + "`(`ID` int(11) not null Auto_Increment,`" + columnName + "` varchar(45) Default null, Primary key (`ID`));");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("Insert into " + tableName + "(" + columnName + ") values(?)");
            // preparedStatement = connection.prepareStatement("Insert into " + tableName + "(" + columnName1 + "," + columnName2 + ") values(?,?)");
            for (int i = 0; i < data1.size(); i++) {
                preparedStatement.setObject(1, data1.get(i));
                preparedStatement.executeUpdate();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static List<Movie> readUserProfileFromSQLTable(String tableName) {
        List<Movie> movieList = new ArrayList<>();
        Movie movie;
        Connection connection = getDatabaseConnection();
        try {
            Statement statement = connection.createStatement();
            String query = "select * from " + tableName;
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("movieId");
                String title = resultSet.getString("movieTitle");
                int releaseYear = resultSet.getInt("releaseYear");
                String genre = resultSet.getString("movieGenre");
                String rating = resultSet.getString("movieRating");
                System.out.format("%s,%s,%s,%s,%s\n",id,title,releaseYear,genre,rating);
                movie=new Movie(id,title,releaseYear,genre,rating);
                movieList.add(movie);
            }
            closeDatabaseConnection();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return movieList;
    }


    public static void main(String[] args) throws Exception {
        //  readDatabaseTableColumn("movies","movieTitle");
        //   readDatabaseTableColumn("movies","movieRating");
        // List<String> data=   readDatabaseTableColumn("movies","movieTitle");

        //   getFrequencyOfWords(data);

        // insertDataFromStringToTable("hello","demo_info","information");
        //  insertDataFromStringToTable("Hi","demo_info","information");

        //  insertDataInMultipleColumn("demo_data","infoA","infoB","Orange","Grape");
        List<String> data1 = new ArrayList<>();
        data1.add("AAA");
        data1.add("BBB");
        data1.add("CCC");
        data1.add("DDD");
//        // data1.add("XXX");
        List<String> data2 = new ArrayList<>();
        data2.add("EEE");
        data2.add("FFF");
        data2.add("GGG");
        data2.add("HHH");
//        insertDataInMultipleColumnFromListString("demo_data", "infoA", "infoB", data1, data2);

        // directDatabaseQueryExecution("select * from movies","movieTitle");

       // insertDataInColumnFromListString(data2, "demo_dbTable", "Address1");
        readUserProfileFromSQLTable("movies");

    }


}
