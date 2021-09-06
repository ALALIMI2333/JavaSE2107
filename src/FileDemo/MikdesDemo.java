package FileDemo;

import java.io.File;

public class MikdesDemo {
     public static void main(String[] args) {
          File dir = new File("./笔记/day01");
          File dir1 = new File("./笔记/day02");
          File dir2 = new File("./笔记/day03");
          if (! dir.exists()){
               dir.mkdirs();
               dir1.mkdir();
               dir2.mkdir();
               System.out.println("文件已经创建了");
          }else {
               System.out.println("已经存在");
          }
     }


}
