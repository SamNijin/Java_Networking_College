package com.samnijin.computernetworks.tcpechoclientandserver;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Eserver {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(8020);

        Socket s = ss.accept();

        DataInputStream dis = new DataInputStream(s.getInputStream());

        PrintStream ps = new PrintStream(s.getOutputStream());

        while (true) {
            String line = dis.readLine();
            ps.println(line);
        }
    }
}
