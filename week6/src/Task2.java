import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql:///test?characterEncoding=utf-8","root","177332");
        String sql = "select * from student";
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
class Emp{
    private String SNO;
    private String Name;
    private int Age;
    private String College;

    public String getSNO() {
        return SNO;
    }

    public void setSNO(String SNO) {
        this.SNO = SNO;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getCollege() {
        return College;
    }

    public void setCollege(String college) {
        College = college;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "SNO='" + SNO + '\'' +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", College='" + College + '\'' +
                '}';
    }

}
