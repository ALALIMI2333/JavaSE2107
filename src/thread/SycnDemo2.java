package thread;

public class SycnDemo2 {
    public static void main(String[] args) {
        Shop shop1 = new Shop();
        Shop shop2 = new Shop();
        Thread t1 = new Thread("苍老师"){
          public void run(){
              shop1.buy();
          }
        };
        Thread t2 = new Thread("大爷"){
            public void run(){
                shop2.buy();
            }
        };
        t1.start();
        t2.start();
    }
}
class Shop{
    public /*synchronized*/ void buy(){
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+":正在挑衣服");
            Thread.sleep(5000);
            synchronized (this){
           // synchronized (new Object()){
            System.out.println(t.getName()+":正在式衣服");
            Thread.sleep(5000);}
            System.out.println(t.getName()+":结账离开");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
