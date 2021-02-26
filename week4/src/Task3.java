import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个小数：");
        String num = in.next();
        String[] strings = new String[2];
        strings = num.split("\\.");
        int a = Integer.parseInt(strings[0]);//网上查询
        int b = Integer.parseInt(strings[1]);
        int fenzi = (int)(a * Math.pow(10,strings[1].length()) + b);
        int fenmu = (int)Math.pow(10,strings[1].length());
        int gongyueshu = fun(fenzi,fenmu);
        System.out.println(fenzi / gongyueshu + "/" + fenmu / gongyueshu);
    }
    public static int fun(int fenzi, int fenmu) {
        int temp = 0;
        do {
            temp = fenzi % fenmu;
            fenzi = fenmu;
            fenmu = temp;
        } while (temp != 0);
        return fenzi;
    }
}
