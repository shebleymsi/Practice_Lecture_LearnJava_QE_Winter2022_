package databaseConnection;

public class Students {

private String stFirstName;
private String stLastName;
private String stScore;
private String stId;
private String stAddress;

    public Students() {
    }

    public Students(String stFirstName) {
        this.stFirstName = stFirstName;
    }

    public Students(String stFirstName, String stLastName) {
        this.stFirstName = stFirstName;
        this.stLastName = stLastName;
    }

    public Students(String stFirstName, String stLastName, String stScore) {
        this.stFirstName = stFirstName;
        this.stLastName = stLastName;
        this.stScore = stScore;
    }

    public Students(String stFirstName, String stLastName, String stScore, String stId) {
        this.stFirstName = stFirstName;
        this.stLastName = stLastName;
        this.stScore = stScore;
        this.stId = stId;
    }

    public Students(String stFirstName, String stLastName, String stScore, String stId, String stAddress) {
        this.stFirstName = stFirstName;
        this.stLastName = stLastName;
        this.stScore = stScore;
        this.stId = stId;
        this.stAddress = stAddress;
    }

    public String getStFirstName() {
        return stFirstName;
    }

    public void setStFirstName(String stFirstName) {
        this.stFirstName = stFirstName;
    }

    public String getStLastName() {
        return stLastName;
    }

    public void setStLastName(String stLastName) {
        this.stLastName = stLastName;
    }

    public String getStScore() {
        return stScore;
    }

    public void setStScore(String stScore) {
        this.stScore = stScore;
    }

    public String getStId() {
        return stId;
    }

    public void setStId(String stId) {
        this.stId = stId;
    }

    public String getStAddress() {
        return stAddress;
    }

    public void setStAddress(String stAddress) {
        this.stAddress = stAddress;
    }



//    @Override
//    public String toString(){
//        return "Students"+"("+"stId= "+stId+")";
//    }


    @Override
    public String toString(){

        return "Students{"+
                "stFirstName='"+stFirstName+'\''+
                ",stLastName='"+stLastName+'\''+
                ",stScore='="+stScore+'\''+
                ",stID='"+stId+'\''+
                '}';

    }


    public static void main(String[] args) {
        Students students=new Students();
        System.out.println( students.toString());
    }




}
