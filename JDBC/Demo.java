import java.sql.Connection;      //Used to create connection between Java program and MySQL database
import java.sql.DriverManager;   //It manages JDBC drivers.
import java.sql.ResultSet;   //Stores data coming from database.
import java.sql.Statement;   //Used to send SQL queries to database.

public class Demo {

    public static void main(String[] args) {

        try {

            // Load JDBC Driver - "Please load MySQL translator"
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection - This object stores connection between Java and MySQL.
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test",
                    "root",
                    "root"
            );  //Used to login into MySQL.

            // Create Statement - Used to send SQL commands to database.
            Statement st = con.createStatement(); //Statement = message sender. Java writes SQL query using Statement.


            // Insert Data - This SQL query inserts data into table.
            int x = st.executeUpdate(
                    "insert into student values(1,'Ekta')"
            );
            //What is executeUpdate()?
            //Used for:
            //INSERT
            //UPDATE
            //DELETE
            //because these operations change database data.

            System.out.println("Rows Inserted : " + x);  //stores number of affected rows.

            // Fetch Data - Fetch all records from student table.
            ResultSet rs = st.executeQuery(
                    "select * from student"        //all columns
            );

            // Print Data
            System.out.println("\nStudent Data");

            while(rs.next()) {       //rs.next() moves one row forward.

                System.out.println(      //Read values from current row.
                        rs.getInt(1) + " " +      //Get column 1 as integer.
                                rs.getString(2)    //Get column 2 as string.
                );
            }

            // Close Connection
            con.close();

        }
        catch(Exception e) {

            System.out.println(e);
        }
    }
}
