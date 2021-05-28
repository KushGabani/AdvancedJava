import java.sql.*;

public class CallableStmt {
    final static String url = "jdbc:mysql://localhost:3306/tutorial";
    final static String host = "root";
    final static String password = "root";

    public static void main(String[]args) {
        try {
            Connection con = DriverManager.getConnection(url, host, password);

            /*
            * CREATE OR REPLACE PROCEDURE getInfo
                   (REG_ID IN NUMBER, FIRSTNAME OUT VARCHAR) AS
                BEGIN
                   SELECT firstName INTO FIRSTNAME
                   FROM Registration
                   WHERE ID = REG_ID;
                END;
            * */
            String call = "{call getInfo(?, ?}";
            CallableStatement cstmt = con.prepareCall(call);

            cstmt.execute();

            cstmt.close();
            con.close();
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
