import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql:///test?characterEncoding=utf-8","root","177332");
        String sql = "select * from student where SNO = 's003'";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        Emp emp = null;
        List<Emp> list = new ArrayList<>();
        while (rs.next()){
            String SNO = rs.getString("SNO");
            String Name = rs.getString("Name");
            int Age = rs.getInt("Age");
            String College = rs.getString("College");
            emp = new Emp();
            emp.setSNO(SNO);
            emp.setName(Name);
            emp.setAge(Age);
            emp.setCollege(College);
            list.add(emp);
        }
        conn.close();
        stmt.close();
        System.out.println(list);
    }
}
