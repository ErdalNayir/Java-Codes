package Model;

public class BankaHesabi {
	private int iban;
	private double bakiye;
	
	public int getIban() {
		return iban;
	}

	public double getBakiye() {
		return bakiye;
	}
	
	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}
	
	public BankaHesabi(int iban, double bakiye) {
		super();
		this.iban = iban;
		this.bakiye = bakiye;
	}

	@Override
	public String toString() {
		return "BankaHesabi [iban=" + iban + ", bakiye=" + bakiye + "]";
	}
}
