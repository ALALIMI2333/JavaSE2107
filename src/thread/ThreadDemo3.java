package thread;

public class ThreadDemo3 {
    public static void main(String[] args) {
       // Runnable r1 = new MyRunnable();
        Runnable r2 =()->{
            for (int i=0;i<1000;i++){
                System.out.println("我是查水表的");
            }
        } ;

        Thread t1  =  new Thread(){
          public void run(){
              for (int i=0;i<1000;i++){
                  System.out.println("你是谁啊");
              }
          }
        };
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }

}
