package Test;

import java.io.File;

public class DeleteTestDemo {
    public static void main(String[] args) throws Exception{
        File file = new File("./tess.txt");

        if (file.exists()){
            boolean delete = file.delete();
            if (delete){
                System.out.println("删除文件");
            }
            else{
                System.out.println("删除不了");
            }
        }
        else {
            file.createNewFile();
            System.out.println("创建了文件");
        }
    }
}
