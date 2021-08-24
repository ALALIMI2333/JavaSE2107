package tesk;

import java.util.Scanner;

public class ReplaceAllDemo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入消息：");
        String str = in.nextLine();
        String s = str.replaceAll("我[去草艹]","xxx");
        System.out.println(s);
    }
}
