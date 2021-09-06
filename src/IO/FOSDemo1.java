package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSDemo1 {
    public static void main(String[] args) throws IOException {
       // FileInputStream fis = new FileInputStream("ff.txt");
        //fis.read();
        FileOutputStream Fos = new FileOutputStream("./fos.dat");
        byte[] b = new byte[0];
        //Fos.write(b,9,8);
        int n = 50+256;
        Fos.write(n);
        Fos.write(51);
        Fos.write(52);
        Fos.write(53);
        //Fos.write(666);
        Fos.close();


    }
}
