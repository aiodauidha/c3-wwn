import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
一开始想用三个for循环，然后查重，但认为这样太过于暴力，又想不出好办法
遂上网查询，学习了“双指针”的方法
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入数组长度：");
        int length = in.nextInt();
        int[] nums = new int[length];
        System.out.print("请输入每个数：");
        for (int i = 0; i < length; i++) {
            nums[i] = in.nextInt();
        }
        System.out.print("target:");
        int target = in.nextInt();
        System.out.println(threeSum(nums, target));
    }
    public static List<List<Integer>> threeSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length;
        Arrays.sort(nums);
        for(int i = 0;i < len-2; i ++){
            if(nums[i] > target)
                break;
            if(i > 0 && nums[i] == nums[i - 1])
                continue;
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == target){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left<right&&nums[left] == nums[left + 1])
                        left ++;
                    while(left<right&&nums[right] == nums[right - 1])
                        right --;
                    left ++;
                    right --;
                }
                else if(sum < target)
                    left ++;
                else  if(sum > target)
                    right --;
            }
        }
        return result;
    }
}
