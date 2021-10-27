package ınnerclassproje;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
       
        
        Scanner scanner= new Scanner(System.in);
        
        
        boolean çıkış=false;
        
        while(!çıkış){
            
            System.out.println("-----------------------------------------------");
            
            System.out.println("0-Çıkış\n"+
                               "1-Alan Hesaplama\n"+
                               "2-Çevre Hesaplama\n"+
                               "3-Vektör İşlemleri");
            
            System.out.println("-----------------------------------------------");
            System.out.print("Merhaba Yapmak istediğiniz işlemi seçin: ");
            
            int islem=scanner.nextInt();
            
            
            if(islem==0){
                System.out.println("Hoşcakalın...");
                çıkış=true;
            }
            
            else if(islem==1){
                
            System.out.println("***********************************************");
            
            System.out.println("1-Kare Alan Hesaplama\n"+
                               "2-Daire Alan Hesaplama\n"+
                               "3-Dikdörtgen Alan Hesaplama");
            
            System.out.println("*************************************************");
            System.out.print("Hangi geometrik şeklin alanını hesaplamak istersiniz: ");
                
            int cevap= scanner.nextInt();
            
                if(cevap==1){
                    
                    System.out.print("Karenin bir kenarının uzunluğunu giriniz: ");
                    
                    int uzunluk=scanner.nextInt();
                    
                    Matematik.Alan.KareAlan(uzunluk);
                }
                else if(cevap==2){
                    System.out.print("Dairenin yarıçapını giriniz: ");
                    
                    int yarıçap =scanner.nextInt();
                    
                    Matematik.Alan.DaireAlan(yarıçap);
                }
                else if(cevap==3){
                    
                    System.out.print("Dikdörtgenin kısa kenarını giriniz: ");
                    
                    int kısa=scanner.nextInt();
                    
                    System.out.print("Dikdörtgenin uzun kenarını giriniz: ");
                    
                    int uzun = scanner.nextInt();
                    
                    Matematik.Alan.DikdortgenAlan(kısa, uzun);
                    
                }
                
            }
            
            else if(islem==2){
                
            System.out.println("***********************************************");
            
            System.out.println("1-Kare Çevre Hesaplama\n"+
                               "2-Daire Çevre Hesaplama\n"+
                               "3-Dikdörtgen Çevre Hesaplama");
            
            System.out.println("*************************************************");
            System.out.print("Hangi geometrik şeklin çevresini hesaplamak istersiniz: ");
                
                int yanıt=scanner.nextInt();
                
                  if(yanıt==1){
                    
                    System.out.print("Karenin bir kenarının uzunluğunu giriniz: ");
                    
                    int uzunluk=scanner.nextInt();
                    
                    Matematik.Çevre.KareÇevre(uzunluk);
                }
                else if(yanıt==2){
                    System.out.print("Dairenin yarıçapını giriniz: ");
                    
                    int yarıçap =scanner.nextInt();
                    
                    Matematik.Çevre.DaireÇevre(yarıçap);
                }
                else if(yanıt==3){
                    
                    System.out.print("Dikdörtgenin kısa kenarını giriniz: ");
                    
                    int kısa=scanner.nextInt();
                    
                    System.out.print("Dikdörtgenin uzun kenarını giriniz: ");
                    
                    int uzun = scanner.nextInt();
                    
                    Matematik.Çevre.DikdortgenÇevre(kısa, uzun);
                    
                }
            }
            
            else if(islem==3){
                
                ArrayList<Vektor> vektörler = new ArrayList<Vektor>();
                
                System.out.print("Kaç tane rastgele vektör oluşturmak istersiniz: ");
                
                int adet=scanner.nextInt();
                
                
                for(int i=0; i<adet; i++){
                    
                    vektörler.add(new Vektor());
                    
                }
                
                System.out.println("********************************************");
                
                System.out.println("1-Vektör toplama\n"+
                                   "2-Vektör Çapımı");
                
                 System.out.println("********************************************");
                 
                 System.out.print("Hangi İşlemi yapmak istersiniz: ");
                 
                 int option=scanner.nextInt();
                 
                 
                 if(option==1){
                     
                     System.out.println("İşlem yapmak istediğiniz iki vektörün indeksini giriniz\n");
                     
                     System.out.print("1.vektör indeks: ");
                     
                     int birinci=scanner.nextInt();
                     
                     vektörler.get(birinci-1).BoyutGöster();
                     
                     System.out.print("2.vektör indeks: ");
                     
                     int ikinci=scanner.nextInt();
                     
                     vektörler.get(ikinci-1).BoyutGöster();
                     
                     Matematik.Vektörİşlemleri.VektorToplam(vektörler.get(birinci-1),vektörler.get(ikinci-1));
                 }
                 
                 else if(option==2){
                     
                     System.out.println("İşlem yapmak istediğiniz iki vektörün indeksini giriniz\n");
                     
                     System.out.print("1.vektör indeks: ");
                     
                     int first=scanner.nextInt();
                     
                     vektörler.get(first-1).BoyutGöster();
                     
                     System.out.print("2.vektör indeks: ");
                     
                     int second=scanner.nextInt();
                     
                     vektörler.get(second-1).BoyutGöster();
                     
                     Matematik.Vektörİşlemleri.VektorCarpım(vektörler.get(first-1),vektörler.get(second-1));
                     
                     
                 }
                
            }
            
            else{
                System.out.println("Böyle bir işlem yoktur lütfen geçerli işlem seçiniz...");
            }
            
            
        }
        
        
        
    }
    
    
}
