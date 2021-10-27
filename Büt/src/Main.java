
public class Main {
    
    static int N = 100;

    static Konut[] konutlar = new Konut[N];
    
    
     static void konut_bul(int sorgutipi){
         
         if (sorgutipi ==1) {
             
             for (Konut konutlar1 : konutlar) {
                 if (konutlar1 instanceof Villa) {
                     Villa konut = (Villa) konutlar1;
                     if(konut.isHavuzluMu() & konut.isOtoparkliMi()){
                         
                         System.out.println("Konut Tipi: "+ "Villa\n");
                         System.out.println("Villa Fiyat: "+konut.fiyat);
                         System.out.println("Villa Konum: "+konut.adres);
                         System.out.println("Villa Yüzölçüm: "+konut.metreKare);
                         System.out.println("Durum: "+((konut.satilik)?"Satılık":"Kiralık"));
                         System.out.println("Villa Kat Sayısı: "+konut.getKat_sayisi());
                         System.out.println("Bahçeli mi?: "+ ((konut.isBahceliMi())?"Evet":"Hayır"));
                         System.out.println("Havuzlu Mu?: "+((konut.isHavuzluMu())?"Evet":"Hayır"));
                         System.out.println("Otoparklı Mı?: "+((konut.isOtoparkliMi())?"Evet":"Hayır")+"\n\n");
                     }
                 }
             }
             
             
         }
         else if(sorgutipi == 2){
             for (Konut konutlar1 : konutlar) {
                 if (konutlar1 instanceof Daire) {
                     Daire konut = (Daire) konutlar1;
                     if(konut.getAdres() =="Bursa" & konut.getOda_sayisi()==3 & konut.getSalon_sayisi()==1 ) {
                         
                         System.out.println("Konut Tipi: "+ "Daire\n");
                         System.out.println("Daire Fiyat: "+konut.fiyat);
                         System.out.println("Daire Konum: "+konut.adres);
                         System.out.println("Daire Yüzölçüm: "+konut.metreKare);
                         System.out.println("Durum: "+((konut.satilik)?"Satılık":"Kiralık"));
                         System.out.println("Daire kat: "+konut.getBulunduguKat());
                         System.out.println("Daire tipi: : "+ (konut.getOda_sayisi()+"+"+konut.getSalon_sayisi())+"\n\n");
                         
                         
                     }
                 }
             }
             
         }
         else if(sorgutipi==3){
              for (Konut konutlar1 : konutlar){
                  if (konutlar1 instanceof Daire){
                      Daire konut = (Daire) konutlar1;
                      
                      if(konut.getBulunduguKat()==1 || konut.getBulunduguKat()==2){
                          if(konut.getMetreKare()>=130){
                              
                                System.out.println("Konut Tipi: "+ "Daire\n");
                                System.out.println("Daire Fiyat: "+konut.fiyat);
                                System.out.println("Daire Konum: "+konut.adres);
                                System.out.println("Daire Yüzölçüm: "+konut.metreKare);
                                System.out.println("Durum: "+((konut.satilik)?"Satılık":"Kiralık"));
                                System.out.println("Daire kat: "+konut.getBulunduguKat());
                                System.out.println("Daire tipi: : "+ (konut.getOda_sayisi()+"+"+konut.getSalon_sayisi())+"\n\n");
                              
                              
                          }
                      }
                      
                  }
              }
             
         }
     }
    
    public static void main(String[] args) {
        
        for(int i=0; i<konutlar.length; i++){
            
            
            
            float probabilty=(float)Math.random();
            float villaOlasilik=(float)Math.random();
        
            boolean kiralik= (probabilty<0.5)?true:false;
            boolean satilik= (probabilty>0.5)?true:false;
            boolean villaMi =(villaOlasilik>0.5)?true:false;

            double metreKare = 80 + (int)(Math.random() * ((450 - 80) + 1));

            int fiyat=(satilik)? 300000 + (int)(Math.random() * ((4500000 - 300000) + 1)): 3000 + (int)(Math.random() * ((30000 - 3000) + 1));; 

            int konum = 1 + (int)(Math.random() * ((3 - 1) + 1));

            String adres ="";

            switch(konum){
                case 1:
                    adres = "Ankara";
                    break;
                case 2:
                    adres="Istanbul";
                    break;
                case 3:
                    adres="Bursa";
                    break;
                default:
                    adres="Bos";
            }
            
            if(villaMi){
                
                Villa villa = new Villa(metreKare, fiyat, satilik, kiralik, adres);
                
                konutlar[i]=villa;
            }
            else{
                Daire daire = new Daire(metreKare, fiyat, satilik, kiralik, adres);
                
                konutlar[i]=daire;
            }
            
            
            
        }
        
        konut_bul(1);
        System.out.println("\n\n\n\n");
        konut_bul(2);
        System.out.println("\n\n\n\n");
        konut_bul(3);
        
        
    }
    
}
