import java.util.Stack;

public class Task2 {
    /*
    这道题，我看到后选择使用将pushed中每个元素压栈，然后与popped第i(i = 0; i++)个元素对比
    这样依次查找，看是否能找到解
    不过，我没能想到判断是否成立的方法
    遂再次登上力扣....发现可以用一个标志变量，由0开始，每完成一个压栈出栈便加一，最终看是否等于数组长度
     */
    public static void main(String[] args) {
        int pushed[] = {1,2,3,4,5};
        int popped[] = {4,5,3,2,1};
        int N = pushed.length;
        Stack<Integer> stack = new Stack();

        int count = 0;
        for (int x: pushed) {
            stack.push(x);
            while (!stack.isEmpty() && count < N && stack.peek() == popped[count]) {
                stack.pop();
                count++;
            }
        }
        if (count == N){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
