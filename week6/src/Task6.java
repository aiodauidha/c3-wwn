import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入矩阵行数：");
        int m = in.nextInt();
        System.out.print("请输入矩阵列数：");
        int n = in.nextInt();
        System.out.println("请输入矩阵：");
        int nums[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = in.nextInt();
            }
        }
//        int k = 2 * m - 1;//一共移动的线路数量
//        while (true){
//            for (int i = 0; i < ; i++) {
//
//            }
//        }
        //一开始我想把这道题化为多个路段，分别取出数，取出后的位置将数变为0，这样每当遇到0时便拐弯，但想了半天没能实现
        int moveRight  = m;//水平步数
        int indexRight = 0;//水平索引
        int moveDown = n - 1;//竖直步数，最开始竖直移动时已经读过第0个数，因此少读一个
        int indexDown = 0;//竖直索引
        int flag = 1;//这里便是我一开始未能想到的方向变化
        while(true){
            int i = 0;
            int j = 0 ;
            if(moveRight != 0 ) {
                for (i = 0; i < moveRight; i++) {
                    System.out.print(nums[indexDown][indexRight + i * flag] + " ");
                }
                indexRight += flag * (moveRight - 1);
                indexDown += flag;
                moveRight--;
            }
            if(moveDown == 0)  break;
            if(moveDown != 0) {
                for (j = 0; j < moveDown; j++) {
                    System.out.print(nums[j * flag + indexDown][indexRight] + " ");
                }
                indexDown += flag * (moveDown - 1);
                indexRight += flag * (-1);
                moveDown--;
            }
            if(moveRight == 0)  break;
            flag = -flag;//flag变号，使得之后的反向移动可以实现+/-

        }
    }
}
