import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nums[] = {0,1,0,3,12};
        int count = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 0 && i + count < nums.length)
            {
                count++;
                for (int j = i; j < nums.length - 1; j++)//数出每个0时，我将后面的数依次前移，直到读过的数的数量与0数量之和等于数组长度
                {
                    nums[j] = nums[j + 1];
                    nums[j + 1] = 0;
                }
            }
        }
        for (int i = nums.length - 1; i > nums.length - 1 - count; i--)
        {
            nums[i] = 0;
        }
        for (int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i] + " ");
        }
        System.out.print("\n");
    }
}
