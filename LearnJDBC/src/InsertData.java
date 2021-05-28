import java.sql.*;
import java.sql.DriverManager;
import java.util.Properties;

public class InsertData {
    static final String url = "jdbc:mysql://localhost:3306/tutorial";

    public static void main(String[]args) {
        try {
            Properties info = new Properties();
            info.setProperty("user", "root");
            info.setProperty("password", "root");
            Connection con = DriverManager.getConnection(url,info);

            // Compulsary set Auto Commit equals to false
            // to execute multiple query in a single batch.
            con.setAutoCommit(false);

            String query = "";
            Statement stmt = con.createStatement();
            query = "INSERT INTO Registration VALUES (100, 'Zara', 'Ali', 18)";
            stmt.addBatch(query);

            query = "INSERT INTO Registration VALUES (101, 'Mahnaz', 'Fatma', 25)";
            stmt.addBatch(query);

            query = "INSERT INTO Registration VALUES (102, 'Zaid', 'Khan', 30)";
            stmt.addBatch(query);

            query = "INSERT INTO Registration VALUES (103, 'Sumit', 'Mittal', 28)";
            stmt.addBatch(query);

            System.out.println("Inserting values...");
            int[] count = stmt.executeBatch();

            con.commit();
            System.out.println(" Inserted all rows.");

            stmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}