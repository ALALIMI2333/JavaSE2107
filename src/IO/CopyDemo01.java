package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("./image.jfif");

        FileOutputStream out = new FileOutputStream("./image_cp2.jfif");
        long t1 = System.currentTimeMillis();
        int b;
        while ((b=in.read())!= -1){
            out.write(b);
        }
        in.close();
        out.close();
        long t2 = System.currentTimeMillis();
        System.out.println("复制完毕,耗时"+(t2-t1));

    }
}
