package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FISDemo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./fos.dat");
        byte[] bytes = new byte[5];
        int b = fis.read();
        System.out.println(b);
       // b = fis.read(bytes,5,6);
        //System.out.println(b);
        b = fis.read();
        System.out.println(b);
        b = fis.read();
        System.out.println(b);
        b = fis.read();
        System.out.println(b);
        b = fis.read();
        System.out.println(b);
        fis.close();
    }
}
