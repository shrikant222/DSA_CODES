package OOPs.Collection;

import java.io.*;
import java.net.*;


public class ex1  {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6013);
        while(true){
            Socket client = ss.accept();
            PrintWriter pout = new PrintWriter(client.getOutputStream(),true);

            pout.println(new java.util.Date().toString());
            System.out.println((new java.util.Date().toString()));
            client.close();
        }
    }
}
