package FileDemo;

import java.io.File;
import java.io.IOException;

public class CreatNewFile  {
    public static void main(String[] args) throws Exception{
        File file = new File("./test.txt");
        boolean created = false;
        try {
            created = file.createNewFile();
            if (created){
                System.out.println("创建成功");
            }else {
                System.out.println("创建失败");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (! file.exists()){
            file.createNewFile();
            System.out.println("创建了文件");
        }else {
            System.out.println("文件已经存在");
        }



    }
}
