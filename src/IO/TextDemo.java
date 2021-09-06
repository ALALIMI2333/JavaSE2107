package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class TextDemo {

    public static void main(String[] args) throws IOException {
        String str = "万丈高楼平地起,辉煌成功靠自己";

        //byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        byte[] bytes = str.getBytes("UTF-8");
        System.out.println(bytes);
        FileOutputStream out = new FileOutputStream("./text.txt");
        out.write(bytes);
        out.close();

        bytes = new byte[2000];
        FileInputStream in = new FileInputStream("./text.txt");
        int n = in.read(bytes);
        System.out.println("读取了字节数:"+n);

        String s = new String(bytes,0,n,"UTF-8");
        System.out.println(s);
        in.close();
    }
}
