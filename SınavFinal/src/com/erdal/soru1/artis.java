package com.erdal.soru1;
public class artis { 
    private int count=0;
    private int miktar;
    public artis(int miktar) {
        this.miktar = miktar;
    }  
    public int getCount() {
        return count;
    }
    public int getMiktar() {
        return miktar;
    }
    public void artir(){
        count++;
        System.out.println(count);
    }  
}
