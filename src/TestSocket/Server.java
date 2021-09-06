package TestSocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    //private Socket socket;
     private ServerSocket serverSocket;
    public Server(){
        try {
            System.out.println("正在启动服务端...");
            serverSocket = new ServerSocket(8088);
            System.out.println("服务端启动完毕了");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){
        try {
            while (true){
                System.out.println("等服务端连接...");
                Socket socket= serverSocket.accept();
                System.out.println("服务端连接了");

                ClientHelder clientHelder = new ClientHelder(socket);
                Thread thread = new Thread(clientHelder);
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Server s = new Server();
        s.start();
    }
}
class ClientHelder implements Runnable{
    private Socket socket;
    public String host;

    public ClientHelder(Socket socket){
        this.socket = socket;
        host = socket.getInetAddress().getHostAddress();
    }
    public void run() {

        try {
            InputStream in = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(in,"UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String message;
            while ((message = br.readLine())!=null){
                System.out.println(host+"说"+message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }
}