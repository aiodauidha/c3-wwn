import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Task1 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql:///test?characterEncoding=utf-8","root","177332");
        String sql1 = "insert into student values('s001','老大',20,'计算机学院')";
        String sql2 = "insert into student values('s002','老二',19,'计算机学院')";
        String sql3 = "insert into student values('s003','老三',18,'计算机学院')";
        String sql4 = "insert into student values('s004','老四',17,'计算机学院')";
        Statement stmt1 = conn.createStatement();
        Statement stmt2 = conn.createStatement();
        Statement stmt3 = conn.createStatement();
        Statement stmt4 = conn.createStatement();
        stmt1.executeUpdate(sql1);
        stmt1.executeUpdate(sql2);
        stmt1.executeUpdate(sql3);
        stmt1.executeUpdate(sql4);
        stmt1.close();
        stmt2.close();
        stmt3.close();
        stmt4.close();
        conn.close();
    }
}
