import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task37 {//这道题实在是不会写了，答案也看不懂，只好等周日讲....
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int n = in.nextInt();
        int[] nums = new int[n];
        System.out.println("请输入该数组：");
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println(subsets(nums));
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int l = nums.length;
        int m = (int)Math.pow(2, l);
        for (int i = 0; i < m; i++){
            String b = Integer.toBinaryString(i);
            int re = nums.length - b.length();
            List<Integer> list = new ArrayList<>();
            for (int j = b.length() - 1; j >= 0; j--){
                if (b.charAt(j) == '1'){
                    list.add(nums[j + re]);
                }
            }
            result.add(list);
        }
        return result;
    }
}
