package FileDemo;

import java.io.File;

public class DeleteDemo {
    public static void main(String[] args) {
        File file = new File("./test.txt");
        boolean deteted = file.delete();
    /*    if (deteted){
            System.out.println("已经删除");
        }
        else {
            System.out.println("删除失败");
        }*/

        if (file.exists()) {
            file.delete();
            //boolean e = file.exists();
            System.out.println("删除文件");
        }else {
            System.out.println("文件不存在");
        }
    }
}
