package Model;

public class VadesizHesap extends BankaHesabi {
	private String hesapT�r�;
	
	
	public String getHesapT�r�() {
		return hesapT�r�;
	}

	public void setHesapT�r�(String hesapT�r�) {
		this.hesapT�r� = hesapT�r�;
	}
	
	public void paraTransferi() {}
	 
	public void krediKartiBorcOdeme() {}
	
	public VadesizHesap(int iban, double bakiye, String hesapT�r�) {
		super(iban, bakiye);
		this.hesapT�r� = hesapT�r�;
	}

	@Override
	public String toString() {
		return "VadesizHesap [hesapT�r�=" + hesapT�r� + "]";
	}

}
