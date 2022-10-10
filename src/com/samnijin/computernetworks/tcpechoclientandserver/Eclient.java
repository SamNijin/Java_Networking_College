package com.samnijin.computernetworks.tcpechoclientandserver;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

public class Eclient {
    public static void main(String[] args) throws Exception {

        InetAddress ia = InetAddress.getLocalHost();
        Socket c = new Socket(ia, 8020);

        String line;
        DataInputStream is, is1;
        PrintStream os;

        os = new PrintStream(c.getOutputStream());
        is = new DataInputStream(System.in);
        is1 = new DataInputStream(c.getInputStream());

        while (true) {
            System.out.println("Client");
            line = is.readUTF();
            os.println(line);
            System.out.println("Server: " + is1.readLine());
        }

    }
}
