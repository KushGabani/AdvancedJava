import java.sql.*;

public class Basics {
    static final String url = "jdbc:mysql://localhost:3306/tutorial";
    static final String host = "root";
    static final String pwd = "root";

    public static void main(String[]args) {
        try {
            System.out.println("Connecting with the Database...");
            Connection con = DriverManager.getConnection(url, host, pwd);

            System.out.println("Creating statement");
            Statement st = con.createStatement();

            String query = "select * from Employees";
            ResultSet rs = st.executeQuery(query);

            while(rs.next()) {
                System.out.println("id : " + rs.getInt(1));
                System.out.println("name: " + rs.getString(3) + " " + rs.getString(4));
                System.out.println("age: " + rs.getInt(2));
                System.out.println("--------------------------");
            }

            st.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
