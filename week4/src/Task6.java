import java.util.Scanner;
import java.util.Stack;
/*
这题不会，经网上查询并理解该方法
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s = in.next();
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '[')
                stack.push(']');
            else if (c == '{')
                stack.push('}');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return true;
    }
}
