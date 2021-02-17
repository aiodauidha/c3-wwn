import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入一行英文字母：");
        String string = in.next();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : string.toCharArray()) {
            if (map.containsKey(c)) {
                int value = map.get(c);
                value ++;
                map.put(c, value);
            }
            else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }
}
