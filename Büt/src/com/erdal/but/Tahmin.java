package com.erdal.but;

/**
 *
 * @author erdal
 */
public class Tahmin {
    
    private String password="";
   

    public Tahmin() {
        
        for(int i=0; i<4; i++){
            
            int sira =(int)(Math.random() * ((25 - 0) + 1));
            
            char harf = (char) ('A'+sira);
            
             this.password= this.password+ harf;
        }
           
    }
    
    
    public synchronized boolean TahminEt(int id,String tahmin){
        
      
        return tahmin.equals(this.password);
        
        
        
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
      
    
}
