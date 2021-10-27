public class Test {
  public static void main(String[] args) {
   Yönetici yönetici1=new Yönetici("Erdal", 10000, "AI Practioners", 8);
   
   yönetici1.BilgileriGöster();
      System.out.println("-----------------------------------------------------");
   yönetici1.DepartmanDeğiştir("AI Senior");
      System.out.println("-----------------------------------------------------");
   yönetici1.BilgileriGöster();
      System.out.println("-----------------------------------------------------");
   
   Çalışan çalışan1 = new Çalışan("Emre", 4000, "Makine Mühendisi");
   
   çalışan1.BilgileriGöster();
   
   
   
   
   
}
  
  
    
}
