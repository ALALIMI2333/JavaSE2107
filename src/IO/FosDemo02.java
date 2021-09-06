package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FosDemo02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./fos.dat",true);
        fos.write(66);
        fos.write(67);
        fos.write(68);
        fos.close();


    }
}
