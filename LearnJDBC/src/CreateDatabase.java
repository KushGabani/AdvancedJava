import java.sql.*;
import java.sql.DriverManager;
import java.util.Properties;

public class CreateDatabase {
    static final String url = "jdbc:mysql://localhost:3306/";

    public static void main(String[]args) {
        try {
            Properties info = new Properties();
            info.setProperty("user", "root");
            info.setProperty("password", "root");
            Connection con = DriverManager.getConnection(url,info);

            Statement stmt = con.createStatement();
            String query = "CREATE DATABASE tutorial";
            // String dropquery = "DROP DATABASE tutorial";

            System.out.println("Creating database...");
            stmt.executeUpdate(query);
//            stmt.executeUpdate(dropquery);

            stmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}