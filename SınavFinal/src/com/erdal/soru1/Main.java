package com.erdal.soru1;

/**
 *
 * @author erdal
 */
public class Main {
    
    public static void main(String[] args) {
        
        artis a = new artis(10);  

//Her görev 1-10 aralığında 2’şer sayıyı sırayla yazdıracak

        gorev1 g1 = new gorev1(a);

        gorev2 g2 = new gorev2(a);

        Thread t1 = new Thread(g1);

        Thread t2 = new Thread(g2);

        t1.start();

        t2.start();
        
    }
    
}
