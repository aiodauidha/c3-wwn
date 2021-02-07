import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("请输入该数组长度：");
        int n = in.nextInt();
        String[] a = new String[n];
        System.out.printf("请分别输入每个字符串：");
        int minlength, i;
        for (i = 0; i < n; i++) {
            a[i] = in.next();
        }
        i = 1;
        for ( minlength = a[0].length() ; i < n; i++ ) {
            if (a[i].length() < minlength) {
                minlength = a[i].length();
            }
        }
        boolean is = false;
        int max = 0;
        for (i = 0; i < minlength; i++) {
            for (int j = 1; j < n; j++) {
                if ((a[0].charAt(i) + "").equals(a[j].charAt(i) + "")) {
                    is = true;
                }
                else {
                    is = false;
                }
            }
            if (is) {
                max++;
            }
        }
        if (max != 0) {
            System.out.printf("最大公共前缀为：");
            for (i = 0; i < max; i++) {
                System.out.print(a[0].charAt(i));
            }
        }
        else {
            System.out.println("没有公共前缀");
        }
    }
}
