package ınterface; // İnterfaceler içine metod oluşturabildiğimiz dosyalardır eğer bir classımızı interfaceten türetcek isek interface deki bütün metodlar kullanılmalıdır
//bir nevi sözleşme gibi bir şey
// İnterfacelerden obje oluşturulamıyor

public interface IMühendis {
    
    void askerlik_sorgula();
    String mezuniyet_ortalaması(double derece);
    void adli_sicil_sorgula();
    void is_tecrübesi(String[] array);
}
