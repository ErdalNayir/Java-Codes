/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erdalnayir.thread1;

/**
 *
 * @author erdal
 */
public class Main {
    
    public static void main(String[] args) {
        
        Printer printer1 = new Printer("Printer 1");
        Printer printer2 = new Printer("Printer 2");
        
        
        printer1.start();
        printer2.start();
    }
    
}
