import java.util.Scanner;

public class Account {
    String accountName;
    double accountBalance;
    Account(String accountName, double accountBalance)
    {
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }
    void checkBalance()
    {
        System.out.println("当前余额为：" + accountBalance);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请分别输入账户名称与余额：");
        Account a = new Account(in.nextLine(), in.nextDouble());
        a.checkBalance();
    }
}
