package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Şarkıcı {
    
    ArrayList<String> şarkıcı_listesi=new ArrayList<String>();
    
    public void ŞarkıcıBastır(){
        
        System.out.println("Şarkıcı listesinde "+şarkıcı_listesi.size()+" kadar şarkıc var");
        
        int i=1;
        
        for(String n : şarkıcı_listesi){
            
            System.out.println(i+".şarkıcı: "+n);
            i++;
        }
        
    }
    
    public void ŞarkıcıEkle(){
       
        Scanner scanner = new Scanner(System.in);
        
        String isim = scanner.nextLine();
        
        int sayac=0;
        
        for(String ad : şarkıcı_listesi ){
            
            if(isim.equals(ad))
                sayac++;
            
        }
        
        if(sayac>0){
            System.out.println("Bu şarkıcı zaten kayıtlı");
        }
        else{
            şarkıcı_listesi.add(isim);
        }
        
    }
}
