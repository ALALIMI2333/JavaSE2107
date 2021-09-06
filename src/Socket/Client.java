package Socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

//192.168.43.173 MOHAMMED DEHAQ
public class Client {
    /*
         java.net.Socket 套接字
         Socket 是 JAVA 提供的一个API ，封装了TCP协议的通讯细节，使用它可以
         和服务端建立连接，并基于一对流的读写操作完成与服务端的数据交互。

         我们可以把SOCKET 想象成是一个电话，发通电话后基于停建
     */
    private Socket socket;
    //构造方法，用于初始化客户端
    public Client(){
        try {
            /*
               实列化SOCKET的程就是与服务端建立连接的过程，这里需要传入两个参数：
               参数1：服务端的地址消息，通常IP地址.
                 可以使用"localhost"表示本机地址.

               参数2:是一个整数，范围0-65535之间，是端口号。
               我们通过地址消息找到网络上服务端计算机，通过端口号找到该机器上运行的服务端应用程序。

               实例化的过程就是连接的过程，如果连接失败构造方法会
             */
            //192.168.43.173
            System.out.println("正在连接....");
            socket = new Socket("192.168.43.173",8088);
            System.out.println("已经连接服务端");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //客户端开始工作方法
    public  void start(){
        try {
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);

            Scanner scanner = new Scanner(System.in);
            while (true){
                String line = scanner.nextLine();
                if ("exit".equals(line)){
                    break;
                }
                pw.println(line);
            }

           // pw.println("你好服务端");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                /*
                     与远端计算机断
                 */
                socket.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
