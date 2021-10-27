package networking;

import java.net.*;
import java.io.*;
/**
 *
 * @author erdal
 */
public class client {
    public static void main(String[] args) throws Exception{
        
        int port = 8900;
        DataInputStream dis;
        DataOutputStream dos;
        
        
        Socket soc = new Socket("127.0.0.1",port);
        System.out.println("Soket Yaratıldı");

        
        dis= new DataInputStream((soc.getInputStream()));
        dos =new DataOutputStream(soc.getOutputStream());
      
    }
    
}
