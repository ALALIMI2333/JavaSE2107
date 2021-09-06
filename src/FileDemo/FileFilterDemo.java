package FileDemo;

import java.io.File;
import java.io.FileFilter;

public class FileFilterDemo {
    public static void main(String[] args) {


        FileFilter filter = new FileFilter() {
            @Override//过滤器的筛选方法
            public boolean accept(File pathname) {
                //写筛选逻辑:pathname 代表每个被赛选的文件
                //找到文件名，检查文件名未尾是否以.txt为结束
                //如果方法返回true表示文件是被选定的文件
                //返回false就是被忽略
                String name = pathname.getName();

                return name.endsWith(".txt");
            }
        };
        File dir = new File("./");
        if (dir.isDirectory()){
           File[] files= dir.listFiles(filter);
           for (File file: files){
               System.out.println(file);
           }
        }
    }
}
