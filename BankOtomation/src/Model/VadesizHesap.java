package Model;

public class VadesizHesap extends BankaHesabi {
	private String hesapTürü;
	
	
	public String getHesapTürü() {
		return hesapTürü;
	}

	public void setHesapTürü(String hesapTürü) {
		this.hesapTürü = hesapTürü;
	}
	
	public void paraTransferi() {}
	 
	public void krediKartiBorcOdeme() {}
	
	public VadesizHesap(int iban, double bakiye, String hesapTürü) {
		super(iban, bakiye);
		this.hesapTürü = hesapTürü;
	}

	@Override
	public String toString() {
		return "VadesizHesap [hesapTürü=" + hesapTürü + "]";
	}

}
