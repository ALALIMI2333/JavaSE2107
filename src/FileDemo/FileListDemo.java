package FileDemo;

import java.io.File;

public class FileListDemo {

    public static void main(String[] args) {
        File file = new File("./demo.txt");

        File[] files = file.listFiles();
        System.out.println(files);

        File dir = new File("./笔记");
        files = dir.listFiles();
        for (File f : files){
           /* for (int i =0;i<files.length; i++){
                File f = files[i];
            }*/
            System.out.println(f);
        }

        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(dir.isDirectory());
        System.out.println(dir.isFile());

        dir = new File("./");
        System.out.println("列出当前目录内容:");
        if (dir.isDirectory()){
            File[]  files1 = dir.listFiles();
            for (File f: files1){
                System.out.println(f);
            }
        }

    }

        }
