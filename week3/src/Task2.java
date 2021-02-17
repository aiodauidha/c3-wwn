import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<People> people = new ArrayList<>();
        people.add(new People(1, "Joe", 70000, 3));
        people.add(new People(2, "Henry", 80000, 4));
        people.add(new People(3, "Sam", 60000, null));
        people.add(new People(4, "Max", 90000, null));
        System.out.println(people);
    }
}

class People {
    private Integer Id;
    private String Name;
    private Integer Salary;
    private Integer ManagerId;

    @Override
    public String toString() {
        return "People{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Salary=" + Salary +
                ", ManagerId=" + ManagerId +
                '}';
    }

    public People(Integer id, String name, Integer salary, Integer managerId) {
        Id = id;
        Name = name;
        Salary = salary;
        ManagerId = managerId;
    }
}
