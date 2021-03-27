import java.util.HashMap;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入数组长度：");
        int n = in.nextInt();
        System.out.print("请输入数组元素：");
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }
        System.out.print("请输入k的值：");
        int k = in.nextInt();
        int len = num.length, max = -10000;
        for (int i = 0; i <= len - k; i++) {
            for (int j = i; j < k + i; j++) {
                if (max < num[j]) {
                    max = num[j];
                }
            }
            System.out.print(max);
            System.out.print(' ');
            max = -10000;
        }
    }
}
