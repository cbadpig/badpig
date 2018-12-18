package code.com.badpig.javacrazy.chapter_17_networkcode.demo_3_socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

/**
 *
 */
public class ServerSocketChannel_A {

    public void serverSocketChannel_demo_a() {
        try {
            Selector selector = Selector.open();
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1",3000);
            serverSocketChannel.bind(inetSocketAddress);
            serverSocketChannel.configureBlocking(false);
            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
            while (selector.select() > 0) {
                for (SelectionKey selectionKey : selector.selectedKeys()) {

                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
