import java.util.HashMap;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer[] array = new Integer[]{1,1,1,1,4,5,6};
        HashMap<Integer,Integer> map = new HashMap<>();
        int num = -1;
        for (int i : array) {
            if (map.containsKey(i)) {
                int value = map.get(i);
                value++;
                map.put(i,value);
            } else {
                map.put(i,1);
            }
        }
        for (int key : map.keySet()) {
            int value = map.get(key);
            if (value > array.length / 2) {
                num = key;
            }
        }
        System.out.println(num);
    }
}
