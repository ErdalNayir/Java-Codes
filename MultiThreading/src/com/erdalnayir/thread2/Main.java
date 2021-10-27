package com.erdalnayir.thread2;

/**
 *
 * @author erdal
 */
public class Main {
    public static void main(String[] args) {
        
        Thread printer1 = new Thread(new Printer("Printer 1"));
        Thread printer2 = new Thread(new Printer("Printer 2"));
        
        printer1.start();
        printer2.start();
    }
    
}
