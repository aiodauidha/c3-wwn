import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入数组长度：");
        int n = in.nextInt();
        System.out.print("请输入数组元素：");
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }
        int max = 0, count = 0;
        for (int i = 0; i < n; i++) {
            if (num[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);
    }
}
