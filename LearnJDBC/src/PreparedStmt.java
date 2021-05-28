import java.sql.*;

public class PreparedStmt {
    final static String url = "jdbc:mysql://localhost:3306/tutorial";
    final static String host = "root";
    final static String password = "root";

    public static void main(String[]args) {
        try {
            Connection con = DriverManager.getConnection(url, host, password);

            String query = "SELECT * FROM registration WHERE id = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, 101);

            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Age: " + rs.getInt("age"));
                System.out.println("First: " + rs.getString("firstName"));
                System.out.println("Last: " + rs.getString("lastName"));
                System.out.println("--------------------------");
            }

            pstmt.close();
            con.close();
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
