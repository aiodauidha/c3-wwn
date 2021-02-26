import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入k：");
        int k = in.nextInt();
        Integer[] array = new Integer[]{9,5,6,7,4,3,1,1,8};//我输入了与题中举例不同的数
        Arrays.sort(array);
        System.out.println(array[k - 1]);
    }
}
