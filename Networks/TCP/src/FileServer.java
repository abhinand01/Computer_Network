import java.io.*;
import java.net.*;

public class FileServer {

    public static void main(String[] args)// throws Exception
    {
        try{
            ServerSocket a = new ServerSocket(4000);
            System.out.println("Waiting For Connection");
            Socket s1 =a.accept();
            System.out.println("connected ");
            System.out.println("File Sending Process starts......");
            FileInputStream f1 = new FileInputStream("C:\\Users\\LENOVO\\Desktop\\jv.txt");
            byte b[]=new byte[3000];
            f1.read(b,0,b.length);
            OutputStream os = s1.getOutputStream();
            os.write(b,0,b.length);
            System.out.println("File sent successfully !");
        }
        catch(IOException e)
        {
            System.out.println("Error"+e.getMessage());
        }


    }
}
