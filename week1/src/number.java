import java.util.Scanner;

public class number {
    int first, first_i, second, second_i;
    number (int first, int first_i, int second, int second_i)
    {
        this.first = first;
        this.first_i = first_i;
        this.second = second;
        this.second_i = second_i;
    }
    void add(int first, int first_i, int second, int second_i)
    {
        System.out.println("两数相加的结果为：" + (first + second) + " + " + (first_i + second_i) + "i");
    }
    void reduce(int first, int first_i, int second, int second_i)
    {
        System.out.println("两数相减的结果为：" + (first - second) + " + " + (first_i - second_i) + "i");
    }
    void multiply(int first, int first_i, int second, int second_i)
    {
        System.out.println("两数相乘的结果为：" + (first * second - first_i * second_i) + " + " + (first * second_i + first_i * second) + "i");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请分别输入两个复数：（第一行输入两个数字分别表示第一个复数的实部和虚部、第二行输入的两个数字表示第二个复数的实部和虚部）");
        number n = new number(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
        n.add(n.first, n.first_i, n.second, n.second_i);
        n.reduce(n.first, n.first_i, n.second, n.second_i);
        n.multiply(n.first, n.first_i, n.second, n.second_i);
    }
}
