package thread;
/*
*多线程
*线程:一个单一的顺序执行流程是一个线程
* 多线程:多个线程并执行
* 并发执行:CPU在每个线程间快速
 */

public class ThreadDemo1 {
    public static void main(String[] args) {

        Thread m1 = new MyThread1();
        Thread m2 = new MyThread2();
        //m1.run();
        //m2.run();
        m1.start();
        m2.start();

/*        for (int i = 0;i<1000;i++){
            System.out.println("你是谁啊？");
        }
        for (int i=0;i<1000;i++){
            System.out.println("开门，查水表的！");
        }*/
    }
}
class MyThread1 extends Thread{
    public void run(){
        for (int i=0;i<1000;i++){
            System.out.println("你是谁啊？");
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        for (int i=0;i<1000;i++){
            System.out.println("开门，查水表的！");
        }
    }
}
