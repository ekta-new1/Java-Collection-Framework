import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//In JDBC, PreparedStatement is used to send SQL queries to the database in a safe, faster, and easier way.
//It protects database from hackers.

//Write the below code in the database - 
//CREATE DATABASE test;
// USE test;
// CREATE TABLE student1(
// id INT, 
// name VARCHAR(50),
// age INT
// );

public class Demo1 {

    public static void main(String[] args) {

        try {

            //Loads MySQL JDBC driver.
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Connects Java program with database.
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test",     //write your own database name
                    "root",       //write your own username and password here
                    "root"
            );

            // ? means values will come later.
            String query = "INSERT INTO student1 VALUES (?, ?, ?)";

            // Database prepares query structure.
            PreparedStatement ps = con.prepareStatement(query);

            // Set Values
            ps.setInt(1, 101);     //first placeholder = 101
            ps.setString(2, "Ekta");   //second placeholder = "Ekta"
            ps.setInt(3, 22);      //third placeholder = 22

            // Execute Query
            int rows = ps.executeUpdate();    //Returns number of affected rows.

            System.out.println(rows + " row inserted");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
