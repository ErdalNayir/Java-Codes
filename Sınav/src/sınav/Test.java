package sınav;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test {
    
    public static void main(String[] args) {
        
        
        Yazar yazar = new Yazar("Mehmet", "Yılmaz","myilmaz@abc.com", 56);
        
        Date date = new GregorianCalendar(2019, Calendar.JANUARY, 1).getTime();
        
        Kitap kitap1= new Kitap("Javayı Seviyorum", date, yazar);
        
        
        System.out.println(kitap1.getYazar().yas);
        
        System.out.println(kitap1.getBasim_tarihi());
        
    }
    
}
