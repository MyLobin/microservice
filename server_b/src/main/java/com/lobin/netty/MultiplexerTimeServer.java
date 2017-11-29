package com.lobin.netty;

import java.io.IOException;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

public class MultiplexerTimeServer implements Runnable{
    private Selector selector;
    private ServerSocketChannel serverSocketChannel;
    private volatile  boolean stop;
    public MultiplexerTimeServer(int port) throws IOException {
        selector=Selector.open();
    }
    @Override
    public void run() {

    }
}
