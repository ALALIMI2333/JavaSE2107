package FileDemo;

import java.io.File;

public class DeleteDir {
    public static void main(String[] args) {
        File file = new File("./mydir");
        if (file.exists()) {
            boolean del = file.delete();
            if (del) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        }
        else {

            System.out.println("文件不存在");

        }
    }
}
