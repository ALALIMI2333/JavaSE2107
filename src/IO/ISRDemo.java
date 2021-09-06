package IO;

import java.io.*;

public class ISRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis= new FileInputStream("ows.txt");
        InputStreamReader isr = new InputStreamReader(fis,"UTF-8");

        int d;
        while ((d=isr.read())!=-1){
            char c = (char) d;
            System.out.print(c);
        }
        isr.close();

    }
}
