package com.nk;



import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * Created by 87825 on 2018/3/30.
 */
public class SockChannelThread implements Runnable {
    private SocketChannel socketChannel;
    private String remoteName;

    public SockChannelThread(SocketChannel socketChannel) {
        try {
            this.socketChannel = socketChannel;
            this.remoteName = socketChannel.getRemoteAddress().toString();
            System.out.println("客户:" + remoteName + " 连接成功!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void run() {
        try {
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            ByteBuffer bufferSize = ByteBuffer.allocate(1024);
            StringBuilder sb = new StringBuilder();
            byte[] bytes;
            while (true) {
                bufferSize.clear();
                int read = socketChannel.read(bufferSize);
                if (read != -1) {
                    sb.setLength(0);
                    bufferSize.flip();
                    int size = bufferSize.getInt();
                    int readCount = 0;
                    bytes = new byte[100];
                    while (readCount < size) {
                        buffer.clear();
                        read = socketChannel.read(buffer);
                        if (read != -1) {
                            readCount += read;
                            buffer.flip();
                            int index = 0;
                            while (buffer.hasRemaining()) {
                                bytes[index++] = buffer.get();
                                if (index >= bytes.length) {
                                    index = 0;
                                    sb.append(new java.lang.String(bytes, "utf-8"));

                                }
                            }
                            if (index > 0) {
                                sb.append(new java.lang.String(bytes, "utf-8"));
                            }
                        }
                    }
                    System.out.println(remoteName +  ":" + sb.toString());
                }
            }
        } catch (Exception e) {
            System.out.println(remoteName + " 断线了,连接关闭");
            try {
                socketChannel.close();
            } catch (IOException ex) {

            }
        }


    }
}
