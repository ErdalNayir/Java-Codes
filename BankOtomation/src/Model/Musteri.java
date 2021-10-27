package Model;

import java.util.Arrays;

public class Musteri extends Kisi {
	private int musteriNumarasi;
	private int[] hesaplar;
	private int[] krediKartlari;
	
	KrediKarti krediKartim;
	BankaHesabi bankaHesabim;
	
	public int getMusteriNumarasi() {
		return musteriNumarasi;
	}
	
	public void setMusteriNumarasi(int musteriNumarasi) {
		this.musteriNumarasi = musteriNumarasi;
	}
	
	public int[] getHesaplar() {
		return hesaplar;
	}
	
	public void setHesaplar(int[] hesaplar) {
		this.hesaplar = hesaplar;
	}
	
	public int[] getKrediKartlari() {
		return krediKartlari;
	}
	
	public void setKrediKartlari(int[] krediKartlari) {
		this.krediKartlari = krediKartlari;
	}

	public Musteri(String ad, String soyad, String email, int telefonNumarasi, int musteriNumarasi, int[] hesaplar,
			int[] krediKartlari) {
		super(ad, soyad, email, telefonNumarasi);
		this.musteriNumarasi = musteriNumarasi;
		this.hesaplar = hesaplar;
		this.krediKartlari = krediKartlari;
	}
	
	public Musteri() { super(); } //default constructor

	@Override
	public String toString() {
		return "Musteri [musteriNumarasi=" + musteriNumarasi + ", hesaplar=" + Arrays.toString(hesaplar)
				+ ", krediKartlari=" + Arrays.toString(krediKartlari) + ", ad=" + ad + ", soyad=" + soyad + ", email="
				+ email + ", telefonNumarasi=" + telefonNumarasi + "]";
	}
}
