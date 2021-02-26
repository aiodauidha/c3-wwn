import java.io.*;

public class Task8 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\csatest\\demo.txt");
        fw.write("csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021");
        fw.close();
        FileReader fr = new FileReader("C:\\csatest\\demo.txt");
        int len = 0;
        String string = "";
        while ((len = fr.read()) != -1 ) {
            string = string + (char)len;
            System.out.print((char) len);
        }
        fr.close();
        int num = 0;
        for (int i = 0; i < string.length() - 3; i++) {
            if (string.charAt(i) == '2' && string.charAt(i + 1) == '0' && string.charAt(i + 2) == '2' && string.charAt(i + 3) == '1') {
                num++;
                i += 4;
            }
        }
        System.out.println();
        System.out.println("一共有" + num + "个2021");
    }
}
