package Model;

import java.util.Arrays;

public class BankaPersoneli extends Kisi {
	private int personelID;
	private String[] müsteriler;
	
	public int getPersonelID() {
		return personelID;
	}
	
	public void setPersonelID(int personelID) {
		this.personelID = personelID;
	}
	
	public String[] getMüsteriler() {
		return müsteriler;
	}
	
	public void setMüsteriler(String[] müsteriler) {
		this.müsteriler = müsteriler;
	}
	
	
	public BankaPersoneli(String ad, String soyad, String email, int telefonNumarasi, int personelID,
			String[] müsteriler) {
		super(ad, soyad, email, telefonNumarasi);
		this.personelID = personelID;
		this.müsteriler = müsteriler;
	}

	@Override
	public String toString() {
		return "BankaPersoneli [personelID=" + personelID + ", müsteriler=" + Arrays.toString(müsteriler) + ", ad=" + ad
				+ ", soyad=" + soyad + ", email=" + email + ", telefonNumarasi=" + telefonNumarasi + "]";
	}
}
