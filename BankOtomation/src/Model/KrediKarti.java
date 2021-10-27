package Model;

public class KrediKarti {
	private int kartNumarasi;
	private int kullanilabilirLimit;
	private double limit;
	private double g�ncelBorc;
	
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

	public double getG�ncelBorc() {
		return g�ncelBorc;
	}

	public void setG�ncelBorc(double g�ncelBorc) {
		this.g�ncelBorc = g�ncelBorc;
	}
	
	public KrediKarti(int kartNumarasi, int kullanilabilirLimit, double limit, double g�ncelBorc) {
		super();
		this.kartNumarasi = kartNumarasi;
		this.kullanilabilirLimit = kullanilabilirLimit;
		this.limit = limit;
		this.g�ncelBorc = g�ncelBorc;
	}

	@Override
	public String toString() {
		return "KrediKarti [kartNumarasi=" + kartNumarasi + ", kullanilabilirLimit=" + kullanilabilirLimit + ", limit="
				+ limit + ", g�ncelBorc=" + g�ncelBorc + "]";
	}
}
