import java.sql.*;
import java.util.Properties;

public class CreateTable {
    static final String url = "jdbc:mysql://localhost:3306/tutorial";
    public static void main(String[]args) {
        try {
            Properties info = new Properties();
            info.setProperty("user", "root");
            info.setProperty("password", "root");

            Connection con = DriverManager.getConnection(url, info);
            Statement stmt = con.createStatement();

            String query = "CREATE TABLE REGISTRATION(" +
                    "id INTEGER NOT NULL PRIMARY KEY," +
                    "firstName VARCHAR(25)," +
                    "lastName VARCHAR(25)," +
                    "age INTEGER)";
//            String dropquery = "DROP TABLE REGISTRATION";

            System.out.println("Creating table...");
            stmt.executeUpdate(query);
//            stmt.executeUpdate(dropquery);
            System.out.println("Registration Table Created.");

            stmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}