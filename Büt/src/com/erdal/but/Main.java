package com.erdal.but;

/**
 *
 * @author erdal
 */
public class Main {
    
    public static void main(String[] args) {
        
        Tahmin tahmin_1 = new Tahmin();
        
        Gorev[] gorevler=new Gorev[10];
        
        for(int i=0;i<gorevler.length;i++){
            gorevler[i]=new Gorev(tahmin_1);
        }
        
        Thread[] threadler=new Thread[gorevler.length];
        
        for(int i=0;i<gorevler.length;i++){
            threadler[i]=new Thread(gorevler[i]);
            threadler[i].start();
        }
        
        
        
        
        
    }
    
}
