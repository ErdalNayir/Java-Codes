package Model;

import java.util.Arrays;

public class BankaPersoneli extends Kisi {
	private int personelID;
	private String[] m�steriler;
	
	public int getPersonelID() {
		return personelID;
	}
	
	public void setPersonelID(int personelID) {
		this.personelID = personelID;
	}
	
	public String[] getM�steriler() {
		return m�steriler;
	}
	
	public void setM�steriler(String[] m�steriler) {
		this.m�steriler = m�steriler;
	}
	
	
	public BankaPersoneli(String ad, String soyad, String email, int telefonNumarasi, int personelID,
			String[] m�steriler) {
		super(ad, soyad, email, telefonNumarasi);
		this.personelID = personelID;
		this.m�steriler = m�steriler;
	}

	@Override
	public String toString() {
		return "BankaPersoneli [personelID=" + personelID + ", m�steriler=" + Arrays.toString(m�steriler) + ", ad=" + ad
				+ ", soyad=" + soyad + ", email=" + email + ", telefonNumarasi=" + telefonNumarasi + "]";
	}
}
