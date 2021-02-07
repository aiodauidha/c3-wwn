import java.util.ArrayList;
import java.util.Scanner;

public class Circle {
    int radius;
    Circle(int radius)
    {
        this.radius = radius;
    }
    void getArea(int radius)
    {
        System.out.println(String.format("the area is " + "%.2f",3.14 * radius * radius));//上网搜索关于如何保留两位小数
    }
    void getPerimeter(int radius)
    {
        System.out.println("the perimeter is " + 2 * 3.14 * radius);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Circle c = new Circle(in.nextInt());
        c.getArea(c.radius);
        c.getPerimeter(c.radius);
    }
}
