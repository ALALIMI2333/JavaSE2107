package FileDemo;

import java.io.File;
import java.io.FileFilter;

public class LambdaDemo {
    public static void main(String[] args) {


        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".txt");
            }
        };

        FileFilter filter1 = (File pathname)->{
            return  pathname.getName().endsWith(".txt");
        };
        FileFilter filter2 = pathname -> pathname.getName().endsWith(".txt");

        File dir = new File("./");
        File[] files= dir.listFiles(filter);
        for (File file: files){
            System.out.println(file);
        }

    }
}
