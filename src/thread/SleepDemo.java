package thread;

import java.util.Scanner;

public class SleepDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了...");

        System.out.println("请输入一个数字:");
        Scanner scanner = new Scanner(System.in);
        for (int num= scanner.nextInt();num>0;num--){
            System.out.println(num);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        System.out.println("程序结束了....");
    }
}
