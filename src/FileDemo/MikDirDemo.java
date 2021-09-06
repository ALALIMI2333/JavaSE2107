package FileDemo;

import java.io.File;

public class MikDirDemo {
    public static void main(String[] args) {
        File dir = new File("./mydir");
        if (! dir.exists()){
            dir.mkdir();
            System.out.println("创建了文件！");
        }else {
            System.out.println("已经存在");
        }
    }
}
