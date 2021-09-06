package Test;

import java.io.File;

public class FileTestDemo {
    public static void main(String[] args) throws Exception{
        File file = new File("./tess.txt");

        if (!file.exists()) {
            boolean b = file.createNewFile();
            if (b) {
                System.out.println("创建了文件");
            } else {
                System.out.println("不能创建文件");
            }
        }
        else {
                System.out.println("文件已经存在");

        }
    }
}
