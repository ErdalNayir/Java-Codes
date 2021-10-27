package com.erdal.but;

/**
 *
 * @author erdal
 */
public class Gorev implements Runnable{
    
     private static int counter = 1;
     private int tahminSayisi=0;

     private final int objectId; 
     
     private Tahmin t;
     


    public Gorev(Tahmin t) {
        this.objectId =counter++;
        this.t = t;
    }
    
    public String Prediction(){
        
        String predicts="";
        
        for(int i=0; i<4; i++){
            
            int sira =(int)(Math.random() * ((25 - 0) + 1));
            
            char harf = (char) ('A'+sira);
            
             predicts= predicts+ harf;
        }
        
        return predicts;
        
    }

    public int getObjectId() {
        return objectId;
    }
    

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Gorev.counter = counter;
    }

  


    
    
    
    

    @Override
    public void run() {
        
       while(true){
           
          boolean sonuc= t.TahminEt(this.objectId, Prediction());
          
          if(sonuc){
              System.out.println("Şifre: "+t.getPassword());
              System.out.println(tahminSayisi+".denemenin sonunda şifreyi "+this.objectId+".görev buldu.");
              break;
          }
          else{
              tahminSayisi++;
          }
          
           
       
       }
        
    }
    
}
