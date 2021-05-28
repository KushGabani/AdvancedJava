import javax.xml.transform.Result;
import java.sql.*;

public class Clauses {
    static final String url = "jdbc:mysql://localhost:3306/tutorial";
    static final String host = "root";
    static final String password = "root";

    public static void main(String[]args) {
        try {
            Connection con = DriverManager.getConnection(url, host, password);
            Statement stmt = con.createStatement();

            String sql = "SELECT id, firstName, lastName, age FROM Registration" +
                    " WHERE firstName LIKE '%za%'";
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", Age: " + rs.getInt("age"));
                System.out.print(", First: " + rs.getString("firstName"));
                System.out.println(", Last: " + rs.getString("lastName"));
                System.out.println("--------------------------");
            }

            con.close();
            stmt.close();
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
