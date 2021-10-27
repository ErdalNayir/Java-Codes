public class Main { // statsic objeler ve metodlar bellekte direkt oluşturulur
    
    public static void main(String[] args) {
   
        Matematik.Alan alan =new Matematik.Alan(); // Matematiğin içindeki alan classından obje oluşturuldu eğer static olmasaydı önce Matematik classı için obje oluşturmalıydık
        
        
        alan.daire_alan(4);
        Matematik.Alan.daire_alan(4); // Eğer metoduda stataic yaparsak
}
    
}
