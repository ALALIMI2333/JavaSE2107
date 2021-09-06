package IO;

import java.io.*;

public class BufferedDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./image_cp3.jpg");
        //将缓冲
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("./img.jpg");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int b;
        while ((b = bis.read())!= -1){
            bos.write(b);
        }
        bis.close();
        bos.close();
        System.out.println("复制完毕！");

    }
}
