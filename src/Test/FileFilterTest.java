package Test;

import java.io.File;
import java.io.FileFilter;

public class FileFilterTest {
    public static void main(String[] args) {

        FileFilter filter =  new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                String name = pathname.getName();
                return name.endsWith(".txt");
            }
        };

        File dir = new File("./");
        //dir.getName();
        if (dir.isDirectory()){
            File[] files = dir.listFiles(filter);
            for (File f : files){
                System.out.println(f);
            }
        }
    }
}
