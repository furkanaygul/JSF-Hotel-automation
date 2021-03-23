import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Kullanici implements Serializable {
	@Id @GeneratedValue
	private Long id;
	private String Ad;
	private String soyad;
	private String cinsiyet;
	private String telefon;
	private String mail;
	private String tc;
	private String ucret;
	private String girisTarihi;
	private String cikisTarihi;
	private String[] oda;

	public String getAd() {
		return Ad;
	}

	public void setAd(String ad) {
		Ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getGirisTarihi() {
		return girisTarihi;
	}

	public void setGirisTarihi(String girisTarihi) {
		this.girisTarihi = girisTarihi;
	}

	public String getCikisTarihi() {
		return cikisTarihi;
	}

	public void setCikisTarihi(String cikisTarihi) {
		this.cikisTarihi = cikisTarihi;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getTc() {
		return tc;
	}

	public void setTc(String tc) {
		this.tc = tc;
	}

	public String getUcret() {
		return ucret;
	}

	public void setUcret(String ucret) {
		this.ucret = ucret;
	}

	public String[] getOda() {
		return oda;
	}

	public void setOda(String[] oda) {
		this.oda = oda;
	}

}