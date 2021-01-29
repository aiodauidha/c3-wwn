import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String a = in.nextLine();
        System.out.print("该字符串的倒序输出为:");
        for (int i = a.length() - 1; i >= 0; i--)
        {
            System.out.print(a.charAt(i));
        }
    }
}
