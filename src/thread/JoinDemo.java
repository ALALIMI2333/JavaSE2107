package thread;

public class JoinDemo {
    public static boolean isFinish = false;
    public static void main(String[] args)  {
        Thread download = new Thread(){

            public void run() {
                System.out.println("down:开始下载图片....");
                for (int i=0;i<=100;i++){
                    System.out.println("down:"+i+"%");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("dowm:图片下载完毕!");
                isFinish = true;
            }
        };

        Thread show = new Thread(){
            public void run(){
                System.out.println("Show the file");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("show:文字显示了");
                System.out.println("show:开始显示图片");
                System.out.println("show:开始等待download.....");
                try {
                    download.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("show:等待download完毕!");
                if (!isFinish){
                    throw new RuntimeException("show:图片加载失败!");
                }
                System.out.println("show:显示图片完毕");
            }
        };
        download.start();

        //show.setDaemon(true);
        show.start();

    }
}
