import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String string = in.next();
//        HashMap<Character,Integer> map = new HashMap<>();
//        for (char c : string.toCharArray()) {
//            if (map.containsValue(c)) {
//                int value = map.get(c);
//                value++;
//                map.put(c,value);
//            } else {
//                map.put(c,1);
//            }
//        }
        int num = -1;
        for (int i = 0; i < string.length(); i++) {
            if (string.indexOf(string.charAt(i)) == string.lastIndexOf(string.charAt(i))) {
                num = i;
            }
        }
        System.out.println(num);
    }
}
