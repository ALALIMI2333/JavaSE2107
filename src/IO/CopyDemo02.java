package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("./image.jfif");
        FileOutputStream out = new FileOutputStream("./image_cp3.jpg");
        long t1= System.currentTimeMillis();
        byte[] b = new byte[1024*8];
        int n;
        while ((n=in.read(b))!=-1){
            out.write(b);
        }
        in.close();
        out.close();
        long t2 = System.currentTimeMillis();
        System.out.println("复制完毕！耗时："+(t2-t1));

    }
}
