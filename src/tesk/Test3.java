package tesk;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("请输入一个网址：");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        if (line.indexOf(".baidu")>=0){
            System.out.println("这个是百度");
        }else if (line.indexOf(".tedu.")>=0){
            System.out.println("这个是达内");
        }else {
            System.out.println("其他网站");
        }
    }
}
