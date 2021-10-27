package Model;

public class YatirimHesabi extends BankaHesabi {
	private String hesapT�r�;
	
	public String getHesapT�r�() {
		return hesapT�r�;
	}

	public void setHesapT�r�(String hesapT�r�) {
		this.hesapT�r� = hesapT�r�;
	}

	public void paraEkle() {}
	
	public void paraCek() {}

	public YatirimHesabi(int iban, double bakiye, String hesapT�r�) {
		super(iban, bakiye);
		this.hesapT�r� = hesapT�r�;
	}
	
	public void hesapEkle() {}
	
	public void krediKartiEkle() {}
	
	public void hesapSil() {}
	
	public void krediKartiSil() {}
	
	@Override
	public String toString() {
		return "YatirimHesabi [hesapT�r�=" + hesapT�r� + "]";
	}
}
