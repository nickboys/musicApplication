package com.nk;

import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by 87825 on 2018/3/30.
 */
public class NioServer {
    public static void main(String[] args) {
        try {
            ServerSocketChannel socketChannel = ServerSocketChannel.open();
            socketChannel.bind(new InetSocketAddress(1234));
            ExecutorService executor= Executors.newFixedThreadPool(10);
            while (true){
                SocketChannel socketChannel1=socketChannel.accept();
                if (socketChannel1!=null){
                    executor.submit(new SockChannelThread(socketChannel1));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



}
