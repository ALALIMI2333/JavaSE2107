package thread;

public class DeamonThreadDemo {
    public static void main(String[] args) {
        Thread rose = new Thread(){
            public void run(){
                for (int i=0;i<5;i++){
                    System.out.println("rose:let me  go!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("rose:啊啊啊啊啊啊啊aaaaaaa");
                System.out.println("背痛");
            }
        };

        Thread jack = new Thread(){
          public void run(){
              for (int i=0;i<5;i++){
                  System.out.println("You jump! i jump");
                  try {
                      Thread.sleep(1000);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
          }
        };

        Thread dahaq = new Thread(){
            public void run(){
                System.out.println("Let me");
                while (true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        };
        rose.start();
        jack.setDaemon(true);
        jack.start();
        dahaq.setDaemon(true);
        dahaq.start();
        while (true);

    }
}
