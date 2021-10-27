package com.erdalnayir.syncronized;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erdal
 */
public class ThreadSafe {
    
    private int count = 0;
    
    public synchronized void arttır(){
        
        count++;
    }
    
    public void threadleriCalistir(){
        
        Thread thread1 = new Thread(new Runnable() {
            
            @Override
            public void run() {
                
                for(int i =0; i<5000; i++){
                    
                    arttır();
                }
               
            }
        });
        
        Thread thread2 = new Thread(new Runnable() {
            
            @Override
            public void run() {
                
                for(int i =0; i<5000; i++){
                    
                    arttır();
                }
               
            }
        });
        
        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadSafe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        System.out.println("Count değişkeninin değeri: "+count);
    }
    
    
    public static void main(String[] args) {
        
        ThreadSafe threadsafe =  new ThreadSafe();
        
        threadsafe.threadleriCalistir();
        
        
    }
    
}
