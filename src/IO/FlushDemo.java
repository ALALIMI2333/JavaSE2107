package IO;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FlushDemo {
    public static void main(String[] args) throws IOException {
        //FileInputStream in = new FileInputStream("")

        FileOutputStream fos = new FileOutputStream("./flush.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        bos.write(65);
        bos.write(66);
        bos.write(67);

        bos.flush();
        bos.close();



    }
}
