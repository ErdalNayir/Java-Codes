public class Test {
    public static void main(String[] args) {
        
        Resolution resolution=new Resolution(1920, 1920);
        Kasa kasa=new Kasa("Asus", "Rog Strix");
        Anakart anakart = new Anakart("GTX", "16gb", "Windows 10");
        Ekran ekran =new Ekran("16", "Samsung", resolution);
        
        Bilgisayar pc =new Bilgisayar(ekran, kasa, anakart);
        
        System.out.println("Çözünürlük:"+pc.getEkran().getResolution().getHight());
        
        
}
    
}
