package FileDemo;

import java.io.File;
import java.util.Date;

public class fileDemo {

    //File file = new File("C:\\Users\\moham\\IdeaProjects\\JavaSE2107\\src\\demo.txt");




    public static void main(String[] args) {
        File file = new File("C:\\Users\\moham\\IdeaProjects\\JavaSE2107\\demo.txt");
        System.out.println(file);

        //File file = new File("./demo.txt");
        long lenght = file.length();
        System.out.println(lenght);
        //System.out.println(file);

        boolean r  = file.canRead();
        boolean w = file.canWrite();
        System.out.println("可读"+r);
        System.out.println("可写"+w);

        long t = file.lastModified();
        System.out.println("最后编辑时间:"+t);
        long y = t/1000/60/60/24/365+1970;
        System.out.println(y);
        System.out.println(new Date(t));
    }

}
