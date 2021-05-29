//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream inp = null;

    public Server(int var1) {
        try {
            this.server = new ServerSocket(var1);
            System.out.println("server started......");
            System.out.println("waiting for the client.....");
            this.socket = this.server.accept();
            System.out.println("Client accepted.....");
            this.inp = new DataInputStream(new BufferedInputStream(this.socket.getInputStream()));
            String var2 = "";

            while(!var2.equals("exit")) {
                try {
                    var2 = this.inp.readUTF();
                    System.out.println(var2);
                } catch (IOException var4) {
                    System.out.println(var4);
                }
            }

            System.out.println("close connection");
            this.socket.close();
            this.inp.close();
        } catch (IOException var5) {
            System.out.println(var5);
        }

    }

    public static void main(String[] var0) {
        new Server(5000);
    }
}
