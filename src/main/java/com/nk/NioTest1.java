package com.nk;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.Channel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * Created by 87825 on 2018/3/30.
 */
public class NioTest1 {
    public static void main(String[] args) {
        try {
            ServerSocketChannel socketChannel = ServerSocketChannel.open();
            socketChannel.bind(new InetSocketAddress(1234));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
