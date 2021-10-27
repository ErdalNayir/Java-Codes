package Model;

public class YatirimHesabi extends BankaHesabi {
	private String hesapTürü;
	
	public String getHesapTürü() {
		return hesapTürü;
	}

	public void setHesapTürü(String hesapTürü) {
		this.hesapTürü = hesapTürü;
	}

	public void paraEkle() {}
	
	public void paraCek() {}

	public YatirimHesabi(int iban, double bakiye, String hesapTürü) {
		super(iban, bakiye);
		this.hesapTürü = hesapTürü;
	}
	
	public void hesapEkle() {}
	
	public void krediKartiEkle() {}
	
	public void hesapSil() {}
	
	public void krediKartiSil() {}
	
	@Override
	public String toString() {
		return "YatirimHesabi [hesapTürü=" + hesapTürü + "]";
	}
}
