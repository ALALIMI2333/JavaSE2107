package thread;

public class SleepDemo2 {
    public static void main(String[] args) {
        Thread lin = new Thread(){
            public void run(){
                System.out.println("林:刚美完容，睡一会吧~");
                try {
                    Thread.sleep(500000);
                } catch (InterruptedException e) {
                    System.out.println("林:干嘛呢!干嘛呢!干嘛呢!都破了像");
                }
                System.out.println("林:醒了");

            }
        };
       Thread huang = new Thread() {
           public void run() {
               System.out.println("黄: 打锤80!小锤40!开始");
               for (int i=0;i<5;i++){
                   System.out.println("黄:80!");
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }

               }
               System.out.println("咣当!");
               System.out.println("黄:大哥!搞定");
           }


       };
       huang.start();
       lin.start();
    }
}
