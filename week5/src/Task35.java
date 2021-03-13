import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x = ");
        int x = in.nextInt();
        int result = 0;
        while (x > 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }
        if (result > Math.pow(2,31) - 1 || result < Math.pow(-2,31))
            result = 0;
        System.out.println(result);
    }
}
