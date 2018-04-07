package com.nk;

import org.springframework.util.StringUtils;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

/**
 * Created by 87825 on 2018/3/30.
 */
public class NioClient {
    public static void main(String[] args) {
        try {
            SocketChannel socketChannel = SocketChannel.open();
            socketChannel.connect(new InetSocketAddress(1234));
            while (true) {
                Scanner sc = new Scanner(System.in);
                String next = sc.next();
                sendMessage(socketChannel, next);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void sendMessage(SocketChannel socketChannel, String msg) {
        if (StringUtils.isEmpty(msg)){
            return;
        }
        try {
              byte[] bytes=msg.getBytes("utf-8");
              int size=bytes.length;
            ByteBuffer buffer=ByteBuffer.allocate(1024);
            ByteBuffer sizeBuffer=ByteBuffer.allocate(1024);
            sizeBuffer.putInt(size);
            buffer.put(bytes);
            buffer.flip();
            sizeBuffer.flip();
            ByteBuffer[] dest={sizeBuffer,buffer};
            while (sizeBuffer.hasRemaining()||buffer.hasRemaining()){
                socketChannel.write(dest);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
