import java.sql.*;

public class SelectData {

    static final String url = "jdbc:mysql://localhost:3306/tutorial";
    static final String host = "root";
    static final String password = "root";

    public static void main(String[]args) {
        try {
            Connection con = DriverManager.getConnection(url, host, password);
            Statement stmt = con.createStatement();

            String query = "SELECT * FROM REGISTRATION";
            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()) {
                System.out.println("id : " + rs.getInt(1));
                System.out.println("name: " + rs.getString(2) + " " + rs.getString(3));
                System.out.println("age: " + rs.getInt(4));
                System.out.println("--------------------------");
            }

            stmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
