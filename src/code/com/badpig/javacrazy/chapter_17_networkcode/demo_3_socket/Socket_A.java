package code.com.badpig.javacrazy.chapter_17_networkcode.demo_3_socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * 客户端通常可以使用socket的构造器来链接指定的服务器
 */
public class Socket_A {

    public void sockert_demo_1() {
        try {
            Socket socket = new Socket("127.0.0.1",3000);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line = bufferedReader.readLine();
            System.out.println(line);
            bufferedReader.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
