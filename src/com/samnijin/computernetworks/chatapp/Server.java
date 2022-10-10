package com.samnijin.computernetworks.chatapp;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws Exception {

        ServerSocket ss = new ServerSocket(3000);

        Socket s = ss.accept();

        System.out.println("Server is ready");

        DataInputStream in = new DataInputStream(s.getInputStream());

        PrintStream ps = new PrintStream(s.getOutputStream());

        while (true) {
            String st = in.readLine();
            System.out.println(st);
            st = new DataInputStream(System.in).readLine();
            ps.println("Server Message -> " + st);
        }

    }

}
