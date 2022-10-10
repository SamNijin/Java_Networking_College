package com.samnijin.computernetworks.chatapp;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws Exception {

        InetAddress ina = InetAddress.getLocalHost();

        Socket s = new Socket(ina, 3000);

        System.out.println("Client is ready");

        DataInputStream dis = new DataInputStream(s.getInputStream());

        PrintStream ps = new PrintStream(s.getOutputStream());

        while (true) {
            String st = new DataInputStream(System.in).readLine();
            ps.println("Client Message -> " + st);

            st = dis.readLine();

            System.out.println(st);
        }
    }

}
