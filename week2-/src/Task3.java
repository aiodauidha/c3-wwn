import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("请输入一个字符串：");
        String s = in.next();
        System.out.printf("其中的数字有：");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                System.out.print(s.charAt(i));
            }
            else {
                do {
                    i++;
                } while (s.charAt(i) >= '0' && s.charAt(i) <= '9');
                i--;
            }
        }
    }
}
