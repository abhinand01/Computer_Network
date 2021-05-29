//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    private Socket socket = null;
    private DataInputStream inp = null;
    private DataOutputStream out = null;

    public Client(String var1, int var2) {
        try {
            this.socket = new Socket(var1, var2);
            System.out.println("Connected......");
            this.inp = new DataInputStream(System.in);
            this.out = new DataOutputStream(this.socket.getOutputStream());
        } catch (UnknownHostException var7) {
            System.out.println(var7);
        } catch (IOException var8) {
            System.out.println(var8);
        }

        String var3 = "";

        while(!var3.equals("exit")) {
            try {
                var3 = this.inp.readLine();
                this.out.writeUTF(var3);
            } catch (IOException var6) {
                System.out.println(var6);
            }
        }

        try {
            this.inp.close();
            this.out.close();
            this.socket.close();
        } catch (IOException var5) {
            System.out.println(var5);
        }

    }

    public static void main(String[] var0) {
        new Client("localhost", 5000);
    }
}
