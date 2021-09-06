package Test;

import java.io.FileInputStream;
import java.io.IOException;

public class FISDemo03 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./fos.dat");
        int b;
        while ((b=fis.read())!=-1){
            System.out.println(b);
        }
        System.out.println(b);
        fis.close();
    }
}
