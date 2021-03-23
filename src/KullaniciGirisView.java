
public class KullaniciGirisView {
private KullaniciGiris KullaniciGiris=new KullaniciGiris();

public boolean giris() {
	if(KullaniciGiris.getKullaniciAdi().equals("admin")&&KullaniciGiris.getSifre().equals("12345")) {
		return true;
	}
	else
		return false;
}
public boolean Cikis() {
	return true;
	
}
public KullaniciGiris getKullaniciGiris() {
	return KullaniciGiris;
}

public void setKullaniciGiris(KullaniciGiris kullaniciGiris) {
	KullaniciGiris = kullaniciGiris;
}
}
