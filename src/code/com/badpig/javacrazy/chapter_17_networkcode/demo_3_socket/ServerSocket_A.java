package code.com.badpig.javacrazy.chapter_17_networkcode.demo_3_socket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ServerSocket对象是用于监听来自客户端的链接
 */
public class ServerSocket_A {

    public void serverSocket_demo_1 () {

        try {
            //创建一个服务器对象ServerSocket，用于监听客户端的链接请求，端口号为：3000
            ServerSocket serverSocket = new ServerSocket(3000);
            //采用顺序，不断地接受来自客户端的请求
            while (true) {
                //每当接收到客户端的Socket请求时，服务器端都会生成一个socket对象，如果未接收到请求，则线程处于等待状态，线程也被阻塞
                Socket socket = serverSocket.accept();
                PrintStream printStream = new PrintStream(socket.getOutputStream());
                printStream.println("您好，您已连上服务器,date【"+ System.currentTimeMillis() +"】");
                printStream.checkError();
                socket.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
