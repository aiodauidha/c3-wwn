import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        String[] strings = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        HashMap<String, List> map = new HashMap<>();
        for (String str : strings) {
            char[] chars = str.toCharArray();//化为字符数组，排序后再化回字符串，这样找出异位词
            Arrays.sort(chars);
            String string = String.valueOf(chars);
            if (!map.containsKey(string)) {
                map.put(string,new ArrayList<String>());
            }
            map.get(string).add(str);//查询如何加入
        }
        System.out.println(map.values());
    }
}
