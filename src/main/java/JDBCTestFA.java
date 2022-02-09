import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;

public class JDBCTestFA {

    private static List<String> getArtistNames(){
        List<String> artist = new ArrayList<>();

        try{
            DriverManager.registerDriver(new Driver());
            Config config = new Config();
            Connection connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
//            Connection connection = DriverManager.getConnection(
//                    //  need clearer understanding of everything after 3306/
//                    "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
//                    "root",
//                    "codeup"
//            );

            Statement stmt = connection.createStatement();
            String query = "SELECT * FROM albums LIMIT 10";
            ResultSet rs = stmt.executeQuery(query);

//            String insert = "INSERT INTO albums (artist, name, release_date, genre, sales) VALUES('Nelly Furtado', 'Loose', 2006, 'Pop, Urban, " +
//                    "R&B', " +
//                    "12.5)";
//            Statement stmt2 = connection.createStatement();
//            stmt2.executeUpdate(insert, Statement.RETURN_GENERATED_KEYS);
//            ResultSet rs2 = stmt2.getGeneratedKeys();
//            if (rs2.next()) {
//                System.out.println("Inserted a new record! New id: " + rs2.getLong(1));
//            }

            while(rs.next()){
                artist.add(rs.getString("artist"));
//                System.out.printf("Here's an album:%n id: %d%n artist: %s%n name: %s%n",rs.getLong("id"), rs.getString("artist"), rs.getString(
//                        "name"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

        return artist;
    }

    //  overloading getEmployerFirstNames() method to make the number to show dynamic
    //    private static List<String> getEmployerFirstNames(){
//        List<String> firstNames = new ArrayList<>();
//
//        try{
//            //  1. Establishing Driver connection
//            //  Only need to make connection once
//            //  new Driver are connecting to DB
//            DriverManager.registerDriver(new Driver());
//            //  getConnection method
//            //  REQUIRES:
//            //      - url for DB
//            //      - username to connect to DB; need to have permissions Granted
//            //      - need to have pw for corresponding username
//            //  Creating Connection object
//            Connection connection = DriverManager.getConnection(
//                    //  need clearer understanding of everything after 3306/
//                    "jdbc:mysql://localhost:3306/employees?allowPublicKeyRetrieval=true&useSSL=false",
//                    "root",
//                    "codeup"
//            );
//
//            //  2. Creating Statement Object
//            Statement stmt = connection.createStatement();
//
//            //  3. Adding query to SELECT names from db
//            //  - be sure to put query in a string
//            String query = "SELECT first_name FROM employees LIMIT 10";
//
//            //  4. Need to execute query
//            //  will use stmt object to create list
//            //  - .executeQuery(String query) -> returns ResultSet object; mainly used for SELECT statements
//            //  - .execute(String query) -> returns a boolean confirming whether or not the query was executed
//            //  - .executeUpdate(String query) -> returns number of rows that are affected
//            //  ResultSet - data from a result set returned
//            ResultSet rs = stmt.executeQuery(query);
//
//            //  5. Handling ResultSet (rs) class
//            //  rs.next() -> returns boolean confirming whether there is a record in the following index or not
//            //  Using a while loop to add each result to our ArrayList until no results are left
//            //  while rs.next() is true(there's a record following in the index)
//            //  while true will add first_name to our firstNames List
//            //  .next() moves "cursor" through results ROW by ROW
//            while(rs.next()){
//                firstNames.add(rs.getString("first_name"));
//            }
//        }catch(SQLException e){
//            e.printStackTrace();
//        }
//
//        //  displaying names from List
//        return firstNames;
//    }
//    //  overloading getEmployerFirstNames() method to make the number to show dynamic
//    private static List<String> getEmployerFirstNames(int numToShow){
//        List<String> firstNames = new ArrayList<>();
//
//        try{
//            //  1. Establishing Driver connection
//            DriverManager.registerDriver(new Driver());
//            Connection connection = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/employees?allowPublicKeyRetrieval=true&useSSL=false",
//                    "root",
//                    "codeup"
//            );
//
//            //  2. Creating Statement Object
//            Statement stmt = connection.createStatement();
//
//            //  3. Adding query to SELECT names from db
//            //  - be sure to put query in a string
//            String query = "SELECT first_name FROM employees LIMIT " + numToShow;
//
//            //  4. Need to execute query
//            //  will use stmt to create list
//            //  - .executeQuery(String query) -> returns ResultSet object; mainly used for SELECT statements
//            //  - .execute(String query) -> returns a boolean confirming whether or not the query was executed
//            //  - .executeUpdate(String query) -> returns number of rows that are affected
//            //  ResultSet - data from a result set returned
//            ResultSet rs = stmt.executeQuery(query);
//
//            //  5. Handling ResultSet (rs)
//            //  rs.next() -> returns boolean confirming whether there is a record in the following index or not
//            //  Using a while loop to add each result to our ArrayList until no results are left
//            //  while rs.next() is true(there's a record following in the index)
//            //  while true will add first_name to our firstNames List
//            while(rs.next()){
//                firstNames.add(rs.getString("first_name"));
//            }
//        }catch(SQLException e){
//            e.printStackTrace();
//        }
//
//        //  displaying names from List
//        return firstNames;
//    }
//
    public static void main(String[] args) {
        // Should return 10 names
//        System.out.println(getEmployerFirstNames());
//        System.out.printf("Limit 10 Employees: %s%n", getEmployerFirstNames());
//        System.out.printf("Limit 25 Employees: %s%n", getEmployerFirstNames(25));

        System.out.println(getArtistNames());

    }
}
