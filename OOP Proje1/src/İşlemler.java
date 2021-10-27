
import java.util.Scanner;

public class İşlemler {
    public void run(Öğrenci öğrenci){
        Login login=new Login();
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Öğrenci Sorgulama Sistemine Hoşgeldiniz...");
        System.out.println("****************************************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("****************************************************");
        int girişhakkı=3;
        
        
        while(true){
            if(login.login(öğrenci)){
                System.out.println("Giriş Başarılı...");
                break;
                
            }
            else{
                System.out.println("Giriş Başarısız oldu...");
                girişhakkı-=1;
                System.out.println("Kalan Deneme Hakkı: "+girişhakkı);
                
            }
            if(girişhakkı==0){
                System.out.println("Deneme Hakkınız Tükenmiştir...");
                return;
            }
        }
        
        System.out.println("----------------------------------------------------");
        String Giriş ="1.Not Hesapla\n"
                       + "2.Devamsızlık Durumunu Sorgula\n"
                       + "3.Profili Görüntüle\n"
                       + "4.Şifre Değiştir\n"
                       + "0.Çıkış Yap\n";
        System.out.println(Giriş);
        System.out.println("----------------------------------------------------");
        
        
        
        while (true) {
            System.out.println("İşlem Seçiniz...");
            String işlem=scanner.nextLine();
            
            if(işlem.equals("1")){
                System.out.println("1.Notu Giriniz");
                int not1=scanner.nextInt();
                System.out.println("2.Notu Giriniz");
                int not2=scanner.nextInt();
                System.out.println("3.Notu Giriniz");
                int not3=scanner.nextInt();
                
                float ortalama=(not1+not2+not3)/3;
                System.out.println("********************************************");
                System.out.println("Not Ortalaması:"+ortalama);
                
            }
            else if(işlem.equals("2")){
                System.out.println("Özürsüz Devamsızlığınız :"+öğrenci.getDevamsızlık());
                System.out.println("--------------------------------------------");
                int kalan=20-öğrenci.getDevamsızlık();
                System.out.println("Kalan Devamsızlık Hakkınız:"+kalan);
                
            }
            else if(işlem.equals("3")){
                öğrenci.BilgileriGöster();
            }
            else if(işlem.equals("4")){
                System.out.println("Eski şifreyi giriniz...");
                String eski=scanner.nextLine();
                if(eski.equals(öğrenci.getŞifre())){
                    System.out.println("Yeni Şifre Giriniz...");
                    String yeni=scanner.nextLine();
                    öğrenci.setŞifre(yeni);
                    System.out.println("Şifreniz değiştirildi");
                   
                }
                else{
                    System.out.println("Yanlış Şifre...");
                }
                            
            }
            
                
            else if(işlem.equals("0")){
                break;
            }
            else{
                System.out.println("Geçersiz İşlem...");
                
            }
            
            
            
            
            
        }
        
        
        
        
    }
    
}
