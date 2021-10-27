package com.erdal.soru1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erdal
 */
public class gorev2 implements Runnable{
    
    artis art;

    public gorev2(artis art) {
        this.art = art;
    }

    @Override
    public void run() {
        
        
        while(art.getCount()<art.getMiktar()){
            
            System.out.println("Kontrol görev 2 de");
            
            art.artir();
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Hata");
            }
        }
        System.out.println("Görev tamamlanmış");
    }
    
    
    
}
