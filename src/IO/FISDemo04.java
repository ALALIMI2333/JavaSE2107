package IO;

import java.io.FileInputStream;
import java.io.IOException;

public class FISDemo04 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./image.jfif");
        //创建一个内存数组，也称为内存缓冲区。大小为8K
        byte[] b = new byte[1024*8];
        int n;
        while ((n=fis.read(b))!=-1){
            System.out.println(n);
        }
        System.out.println(n);
        fis.close();
    }
}
