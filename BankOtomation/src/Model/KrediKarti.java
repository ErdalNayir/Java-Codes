package Model;

public class KrediKarti {
	private int kartNumarasi;
	private int kullanilabilirLimit;
	private double limit;
	private double güncelBorc;
	
	public int getKartNumarasi() {
		return kartNumarasi;
	}

	public void setKartNumarasi(int kartNumarasi) {
		this.kartNumarasi = kartNumarasi;
	}

	public int getKullanilabilirLimit() {
		return kullanilabilirLimit;
	}

	public void setKullanilabilirLimit(int kullanilabilirLimit) {
		this.kullanilabilirLimit = kullanilabilirLimit;
	}

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}

	public double getGüncelBorc() {
		return güncelBorc;
	}

	public void setGüncelBorc(double güncelBorc) {
		this.güncelBorc = güncelBorc;
	}
	
	public KrediKarti(int kartNumarasi, int kullanilabilirLimit, double limit, double güncelBorc) {
		super();
		this.kartNumarasi = kartNumarasi;
		this.kullanilabilirLimit = kullanilabilirLimit;
		this.limit = limit;
		this.güncelBorc = güncelBorc;
	}

	@Override
	public String toString() {
		return "KrediKarti [kartNumarasi=" + kartNumarasi + ", kullanilabilirLimit=" + kullanilabilirLimit + ", limit="
				+ limit + ", güncelBorc=" + güncelBorc + "]";
	}
}
