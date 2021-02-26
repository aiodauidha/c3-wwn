import java.io.*;

public class Task9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("c:\\csatest\\demo.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\csatest2\\demo2.txt"));
        char[] data = new char[1024];
        int len = 0;
        while ((len = br.read(data)) != -1) {
            bw.write(data);
        }
        bw.close();
        br.close();
    }
}
