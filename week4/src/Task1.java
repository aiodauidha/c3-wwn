import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String string = in.next();
        System.out.println("请输入一个子串：");
        String child = in.next();
        int num = -1;
        for (int i = 0; i <= string.length() - child.length(); i++) {
            if (string.substring(i, i + child.length()).equals(child)) {
                num = i;
                break;
            }
        }
        System.out.println(num);
    }
}
