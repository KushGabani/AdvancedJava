import java.sql.*;

public class UpdateData {
    static final String url = "jdbc:mysql://localhost:3306/tutorial";
    static final String host = "root";
    static final String password = "root";

    public static void main(String[]args) {
        try {
            Connection con = DriverManager.getConnection(url, host, password);
            Statement stmt = con.createStatement();

            System.out.println("Updating value of age...");
            String query = "UPDATE REGISTRATION SET age = 30 WHERE id IN (101, 103)";

            int rowsAffected = stmt.executeUpdate(query);
            System.out.println(rowsAffected + " rows affected.");

            con.close();
            stmt.close();
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
