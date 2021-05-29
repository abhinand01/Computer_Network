import java.net.*;
import java.io.*;

public class Client {

    public static void main(String[] args) throws Exception
    {
        byte b[]=new byte[3000];
        FileInputStream f=new FileInputStream("C:\\Users\\LENOVO\\Desktop\\jv.txt");
        System.out.println("File sending using UDP");

        DatagramSocket ds=new DatagramSocket();
        int i=0;
        while(f.available()!=0)
        {
            b[i]=(byte)f.read();
            i++;
        }
        System.out.println("The file sent successfully");
        f.close();
        ds.send(new DatagramPacket(b,i,InetAddress.getLocalHost(),2222));

    }
}
