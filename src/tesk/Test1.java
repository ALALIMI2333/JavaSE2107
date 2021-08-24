package tesk;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length;
        String name;
        do {
            System.out.println("请输入用户名：");
            name = scan.nextLine().trim();
            length = name.length();
            System.out.println("Length:"+length);

        }while (length<1||length>20);{
            System.out.println("合理用户名："+name);
        }
    }

}
