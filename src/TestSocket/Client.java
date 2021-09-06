package TestSocket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;
//192.168.43.173 dehaq
//192.168.43.173
//192.168.43.14 majed
public class Client {
    private Socket socket;
    //ServerHandler s = new ServerHandler();

    public Client(){
        try {
            System.out.println("The client trying to connecting to server.....");
            socket = new Socket("192.168.43.173",8088);
            System.out.println("The client already connected");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){
        try {
            ServerHandler serverHandler = new ServerHandler();
            Thread t =new Thread(serverHandler);
            t.start();

            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os,"UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);



            Scanner scan = new Scanner(System.in);

            while (true){
                String line = scan.nextLine();
                if ("exit".equals(line)){
                    break;
                }
                pw.println(line);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
    private class ServerHandler implements Runnable{
        public void run(){
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));

                String message;
                while ((message = br.readLine())!=null){
                    System.out.println(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


