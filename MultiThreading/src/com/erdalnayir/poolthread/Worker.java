package com.erdalnayir.poolthread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erdal
 */
public class Worker implements Runnable{

        private String isim;
        private int taskId;

    public Worker(String isim, int taskId) {
        this.isim = isim;
        this.taskId = taskId;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }
        
    
    
    
    
    @Override
    public void run() {
        
        System.out.println(taskId+" task Id'li Worker "+isim+" işe başladı");
        
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                System.out.println("Hata oluştu");
            }
            
            System.out.println(taskId+" task Id'li Worker "+isim+" işe bitirdi");
    }
    
    
}
