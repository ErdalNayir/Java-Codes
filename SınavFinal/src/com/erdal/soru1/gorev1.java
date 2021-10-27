package com.erdal.soru1;

/**
 *
 * @author erdal
 */
public class gorev1 implements Runnable{
    
    artis art;

    public gorev1(artis art) {
        this.art = art;
    }

    
    
    @Override
    public void run() {
        
       
        
         while(art.getCount()<art.getMiktar()){
             System.out.println("Kontrol Görev 1 de");
            
            art.artir();
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Hata");
            }
        }
         System.out.println("Görev Tamamlanmış");
        
        
    }
    
}
