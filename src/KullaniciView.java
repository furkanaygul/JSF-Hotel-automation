import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;

import com.mergeCons.egitim.util.EntityUtil;
import com.sun.tools.doclint.Entity;

public class KullaniciView {

	public KullaniciView() {

	}

	private Kullanici Kullanici = new Kullanici();
	// private List<Kullanici> Listele = new ArrayList<Kullanici>();
	private String ad;
	private String soyad;

	public void kaydet() {
		/*
		 * if (Kullanici.getAd()!=null && Kullanici.getSoyad() != null &&
		 * Kullanici.getCinsiyet() != null && Kullanici.getMail() != null &&
		 * Kullanici.getTc() != null && Kullanici.getTelefon() != null &&
		 * Kullanici.getCikisTarihi() != null && Kullanici.getGirisTarihi() != null &&
		 * Kullanici.getUcret() != null*) {
		 * 
		 * 
		 * }
		 */
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.persist(Kullanici);
		en.getTransaction().commit();// veri tabaninda islem yapabilmesi icin
		// Listele.add(Kullanici);
		Kullanici = new Kullanici();
	}

	public String convert(String a[]) {
		return Arrays.toString(a);
	}

	public void sil() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.remove(Kullanici);
		en.getTransaction().commit();
		Kullanici = new Kullanici();
	}

	public void guncelle() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.merge(Kullanici);
		en.getTransaction().commit();
		Kullanici = new Kullanici();
	}

	public List<Kullanici> listele() {
		EntityManager en = EntityUtil.getEntityManager();
		return en.createQuery("from Kullanici").getResultList();
	}

	public List<Kullanici> ara() {
		EntityManager en = EntityUtil.getEntityManager();
		return en.createQuery("from Kullanici where "
		+ " Ad like :Ad" + " and soyad like :soyad")
				.setParameter("Ad", this.ad + "%").setParameter("soyad", this.soyad + "%").getResultList();
	}

	public Kullanici getKullanici() {
		return Kullanici;
	}

	public void setKullanici(Kullanici kullanici) {
		this.Kullanici = kullanici;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	/*
	 * public List<Kullanici> getListele() { return Listele; }
	 * 
	 * public void setListele(List<Kullanici> listele) { Listele = listele; }
	 */
	public String arama() {
		return "ara";
	}
}
