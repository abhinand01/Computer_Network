import java.io.*;
import java.net.*;


public class Server {
    public static void main(String[] args) throws Exception{

        byte b[]=new byte[3072];
        DatagramSocket ds=new DatagramSocket(2222);

        System.out.println("UDP Server started");
        FileOutputStream f=new FileOutputStream(  "D:\\javaUDP.txt");


        while(true)
        {
            DatagramPacket dp=new DatagramPacket(b,b.length);
            ds.receive(dp);
            //System.out.println(new String(dp.getData(),0,dp.getLength()));
            System.out.println("The file recieved successfully");

        }

    }
}
