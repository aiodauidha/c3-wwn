import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入数组长度：");
        int n = in.nextInt();
        System.out.print("请输入数组元素：");
        int num[] = new int[n];
        HashMap<Integer,Integer> hashSet = new HashMap<>();
        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
            if (!hashSet.containsKey(num[i])) {
                hashSet.put(num[i], 1);
            } else {
                int t = hashSet.get(num[i]);
                hashSet.put(num[i], ++t);
            }
        }
        int sum = 0;
        for (Integer integer : hashSet.keySet()) {
            if (hashSet.get(integer) == 1) {
                sum += integer;
            }
        }
        System.out.println(sum);
    }
}
