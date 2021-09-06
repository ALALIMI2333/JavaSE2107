package thread;

public class CurrentThread {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        Thread t = new Thread(){
            public void run(){
                Thread t = Thread.currentThread();
                System.out.println("自定义线程:"+t);
                dosom();
                System.out.println("自定义线程执行完毕!");
            }
        };

        System.out.println("主线程:"+main);

        dosom();
        System.out.println("主线程执行完毕");

        }
    public static void dosom(){
        Thread t = Thread.currentThread();
        for (int i=0;i<1000;i++){
            System.out.println("执行dosome方法的线程是:"+t);
        }
    }
}
