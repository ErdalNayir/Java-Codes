package com.erdalnayir.thread2;

/**
 *
 * @author erdal
 */
public class Printer implements Runnable{
    
    private String isim;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Printer(String isim) {
        this.isim = isim;
    }

    @Override
    public void run() {
        
        for(int i =1; i<11; i++){
            
            System.out.println(this.isim+" çalışıyor: "+i);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Kesintiye uğradı.");
            }
        }
        System.out.println(this.isim+" çalışmayı bitridi.");
       
        
    }
    
}
