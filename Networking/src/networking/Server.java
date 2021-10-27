package networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    
     public static void main(String[] args) throws Exception{
        
        int port = 8900;
        DataInputStream dis;
        DataOutputStream dos;
        
        System.out.println("Dinlenmeye Başlandı");
        ServerSocket sersoc = new ServerSocket(port);
        
      
        Socket soc = sersoc.accept();
        System.out.println("Birisi Bağlandı");
        
        dis= new DataInputStream((soc.getInputStream()));
        dos =new DataOutputStream(soc.getOutputStream());
        
   
        
    }
    
}
