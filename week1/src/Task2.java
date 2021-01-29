import java.util.Scanner;

public class Task2 {
    public static int f(int x)
    {
        int s;
        s = x * x * x;
        return s;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c, d, count = 0;
        for (int i = 100; i < 1000; i++)
        {
            a = i % 10;
            b = i / 10 % 10;
            c = i / 100;
            d = f(a) + f(b) + f(c);
            if (d == i)
            {
                count ++;
            }
        }
        System.out.println("1000以内的水仙花数有" + count + "个");
    }
}