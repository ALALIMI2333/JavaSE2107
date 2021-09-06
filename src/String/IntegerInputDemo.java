package String;

import java.util.Scanner;

public class IntegerInputDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入年龄:");
        String str = in.nextLine();
        int age = Integer.parseInt(str);
        System.out.println(age);
    }
}
