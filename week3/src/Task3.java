import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("请输入一行字符串：");
        Scanner in = new Scanner(System.in);
        String string = in.next();
        int length = string.length();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < length; i++) {
            set.add(string.charAt(i));
        }
        System.out.print("组成新字符串：");
        for (Character c : set) {
            System.out.print(c);
        }
    }
}
