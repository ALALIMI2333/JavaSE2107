package Test;

import java.io.*;

public class BufferedDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis= new FileInputStream("./img.jpg");
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream out = new FileOutputStream("./img2.png");
        BufferedOutputStream bos = new BufferedOutputStream(out);

        int n ;
        while ((n=bis.read())!=-1){
            bos.write(n);
        }
        bis.close();
        bos.close();
        System.out.println("复制成功");
    }
}
