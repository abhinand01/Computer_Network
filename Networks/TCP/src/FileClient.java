import java.io.*;
import java.net.*;

public class FileClient {
    public static void main(String[] args)
    {
        try{
            byte[] b = new byte[3000];
            Socket s = new Socket("localhost",4000);
            InputStream is = s.getInputStream();
            FileOutputStream f = new FileOutputStream("D:\\java.txt");
            is.read(b,0,b.length);
            f.write(b,0,b.length);
            System.out.println("File saved successfully !");
        }
        catch(IOException e){
            System.out.println("Error "+e.getMessage());
        }

    }
}
