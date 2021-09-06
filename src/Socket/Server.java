package Socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*
 *聊天室服务端
 */
public class Server {
    private ServerSocket serverSocket;
    //private PrintWriter[] allOut = {};
    public Collection<PrintWriter> allOut = new ArrayList<>();

    public Server(){
        try {
            System.out.println("正在启动服务端...");
            serverSocket = new ServerSocket(8088);
            System.out.println("服务端启动完毕!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){
        try {
            while (true) {
                System.out.println("等待客户端连接...");
                Socket socket = serverSocket.accept();
                System.out.println("一个客户端连接了!");

                ClientHandler clientHandler = new ClientHandler(socket);
                Thread t = new Thread(clientHandler);
                t.start();


            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    class ClientHandler implements Runnable{
        private Socket socket;
        private String host; //客户端地址信息

        public ClientHandler(Socket socket){
            this.socket = socket;
            host = socket.getInetAddress().getHostAddress();
        }
        public void run(){
            PrintWriter pw = null;
            //Collection<PrintWriter> allOut;
           // allOut = new ArrayList<>();
            try {
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in,"UTF-8");
                BufferedReader br = new BufferedReader(isr);



               pw = new PrintWriter(
                        new OutputStreamWriter(socket.getOutputStream(),"UTF-8")
                        ,true);
               synchronized (Server.this) {
                   //1对allOut数组扩容
                   //allOut = new ArrayList<>();
                 /*  //Collection<PrintWriter> allOut;
                   allOut = Arrays.copyOf(allOut, allOut.size() + 1);
                   //2将当前输出流存入数组最后一个位置
                   allOut[allOut.size() - 1] = pw;*/
                   allOut.add(pw);
               }
                sendMessage(host+"上线了，当前"+allOut.size());
                String message;
                while ((message = br.readLine())!= null){
                    System.out.println(host+"说:"+message);
                    sendMessage(host+"说:"+message);

                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                synchronized (Server.this){
                   /*for (int i = 0; i < allOut.size(); i++){
                        if (allOut[i] ==pw){
                          allOut[i] = allOut[allOut.size()-1];
                          allOut = Arrays.copyOf(allOut,allOut.size()-1);
                          break;
                                      }
                    }*/
                    allOut.remove(pw);
                }
                sendMessage(host+"下线了，当前在线人数"+allOut.size());

                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
        private  void sendMessage(String message){
            synchronized(Server.this){
            for (PrintWriter pw: allOut ) {
                pw .println(host + "说:" + message);
            }
         }
        }
    }
}