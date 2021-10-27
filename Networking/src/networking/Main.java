package networking;

import java.net.*;
import java.io.*;

/**
 *
 * @author erdal
 */
public class Main {
    
    public static void main(String[] args) throws Exception{
        
        int port = 8000;
        DataInputStream dis;
        DataOutputStream dos;
        
        System.out.println("Dinlenmeye Başlandı");
        ServerSocket sersoc = new ServerSocket(port);
        
      
        Socket soc = sersoc.accept();
        System.out.println("Birisi Bağlandı");
        
        dis= new DataInputStream((soc.getInputStream()));
        dos =new DataOutputStream(soc.getOutputStream());
        
        double yaricap = dis.readDouble();
         System.out.println("Veri Geldi yarıçap: "+yaricap);
        
        double alan =yaricap*yaricap*Math.PI;
        dos.writeDouble(alan);
        System.out.println("Alan hesaplandı alan: "+alan);
        
    }
    
}
