import java.sql.*;

public class Rollbacks {
    final static String url = "jdbc:mysql://localhost:3306/tutorial";
    final static String host = "root";
    final static String password = "root";
    
    public static void main(String[]args) throws SQLException{
        Connection con = DriverManager.getConnection(url, host, password);
        Statement stmt = con.createStatement();

        try{
            con.setAutoCommit(false);

            String query;
            query = "INSERT INTO Employees  " +
                    "VALUES (106, 'Rita', 'Tez', 20)";
            stmt.executeUpdate(query);

            query = "INSERTED IN Employees  " +
                    "VALUES (107, 22, 'Sita', 'Singh')";
            stmt.executeUpdate(query);

            con.commit();
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
            con.rollback();
        }
        finally {
            stmt.close();
            con.close();
        }
    }
}
