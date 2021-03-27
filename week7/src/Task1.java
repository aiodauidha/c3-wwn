import java.util.HashMap;
import java.util.Stack;

public class Task1 {
    /*以前可以说是从没做过关于栈的编程题，拿到这道题的时候我的第一反应是暴力解法
    即利用循环，依次取出num1的数字，每次都遍历num2直到找到第一个比该数大的数字，然后输出。不然输出-1
    但想了，真的不知道用栈该怎么写
    因此，直接上力扣寻找题解，原理看懂了，但代码还是比较懵
     */


        /**
         * @param findNums  指目标数组
         * @param nums      指需要确定下一位更大值得元素所在数组
         * @return
         */
        public static int[] nextGreaterElement(int[] findNums, int[] nums) {

            Stack< Integer > stack = new Stack < > ();

            // map存储<k,v>，要求数值上 k < v。 k, v都是在nums中，v不存在则为-1表示。
            HashMap< Integer, Integer > map = new HashMap < > ();

            for (int i = 0; i < nums.length; i++) {
                // nums[i] 即为当前元素

                while (!stack.empty() && nums[i] > stack.peek()) {
                    // k 为stack.pop(), v为nums[i],  满足 k > v， v就是k要找的值
                    map.put(stack.pop(), nums[i]);
                }

                // 还没找到比当前栈顶元素大的值，则nums[i]继续入栈
                stack.push(nums[i]);
            }

            // 处理栈中遗留的找不到下一个更大值的元素作为k, 对应v 默认为-1
            while (!stack.empty()) {
                map.put(stack.pop(), -1);
            }


            // 遍历findNums， 由于findNums是nums的子集合，所以直接根据元素去map中取值即可
            int[] res = new int[findNums.length];
            for (int i = 0; i < findNums.length; i++) {
                res[i] = map.get(findNums[i]);
            }
            return res;
        }

    public static void main(String[] args) {
            int num1[] = {4,1,2};
            int num2[] = {1,3,4,2};
        for (int i : nextGreaterElement(num1,num2)) {
            System.out.println(i);
        }
    }
}
