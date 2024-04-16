package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;

import static databaseConnection.ConnectDatabase.loadProperties;

public class DatabaseConnectionDirectly {

    public static void main(String[] args) {

        // Database connection: JDBC connect

        String url = "jdbc:mysql://localhost:3306/qe_winter2022?serverTimezone=UTC&useSSL=false";
        // String url = "jdbc:mysql://localhost:3306/classicmodels?serverTimezone=UTC&useSSL=false";
        String user = "root";
        // Please change password accordingly: MYSQL Password
        String password = "Rootroot123456";

        // Create connection
        Connection connection = null;
        Statement statement = null;


        // Movie class is using to insert data
        Movie maveric = new Movie(10, "Maveric", 2022, "Action", "5");
        Movie forestgump = new Movie(11, "forestgump", 1994, "Drame", "PG-13");
        Movie topGun1986 = new Movie(12, "topGun1986", 1986, "Action", "PG-14");
        Movie lordOfTheRing = new Movie(13, "lordOfTheRing", 2001, "Fiction", "PG-10");
        Movie matrix = new Movie(14, "Matrix", 1999, "Action", "PG-15");
        Movie harryPotter = new Movie(15, "Harry Potter", 2001, "Fantasy", "PG-7");
        Movie titanic = new Movie(16, "Titanic", 1997, "Romantic", "PG-13");
        Movie titanic1 = new Movie(17, "Titanic1", 1997, "Romantic", "PG-13");

        System.out.println(titanic.getMovieTitle());
        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(maveric);
        movies.add(forestgump);
        movies.add(topGun1986);
        movies.add(lordOfTheRing);
        movies.add(matrix);
        movies.add(harryPotter);
        movies.add(titanic);
        movies.add(titanic1);


        // Develop Database connection
        try {
            Properties properties = loadProperties("configProperty/Secret.properties");
            String url1=properties.getProperty("MYSQLJDBC.url");
            String username=properties.getProperty("username");
            String pass=properties.getProperty("password");
            //String driverClass=properties.getProperty("MYSQLJDBC.driver");
          //  Class.forName(driverClass);

            connection = DriverManager.getConnection(url1, username, pass);
           // connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

            // INSERT INTO tableName(columnName1,columnName2) VALUES ( '  Gilbert  '  , 'Kevin','M','Tool Design',33)

            for (Movie mv : movies) {
                String insertQuery = "insert into movies(movieId,movieTitle,releaseYear,movieGenre,movieRating)" + "values( " + mv.getMovieId() + ",'" + mv.getMovieTitle() + "'," + mv.getReleaseYear() + ",'" + mv.getMovieGenre() + "','" + mv.getMovieRating() + "')";
                statement.execute(insertQuery);
            }


            String query = "select * from movies";
            //  statement.execute("select * from customers");
            statement.execute(query);
            System.out.println(statement.execute(query));

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }


    }


}
