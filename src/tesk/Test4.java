package tesk;

import java.util.Random;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        String chs = "abcdefghijklmenopkrstuvwxyzABCDEFGHLMNOPKRSTYZ0123456789";
        int length = chs.length();
        Random random = new Random();
        StringBuilder stb = new StringBuilder();
        stb.append(chs.charAt(random.nextInt(length)))
        .append(chs.charAt(random.nextInt(length)))
                .append(chs.charAt(random.nextInt(length)))
                .append(chs.charAt(random.nextInt(length)));

                String code = stb.toString();
        Scanner in = new Scanner(System.in);
        System.out.println(code);
        System.out.println("输入你的验证码：");
        String input = in.nextLine();
        if (code.equalsIgnoreCase(input)){
            System.out.println("验证码一致");
        }else {
            System.out.println("验证码错误！");
        }


    }
}
