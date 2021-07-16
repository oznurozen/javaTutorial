package quiz;


/*private olarak kullanýcý adý, soyadý ve yaþý oluþturunuz. setter ve getter 
 * metodlarý ile eriþimi açýk hale getirerek kullanýcýdan alýnan ad soyad ve yaþ bilgisini 
 * private deðiþkenler içerisine aktarýnýz ve çýktý olarak kullanýcýdan alýnan verileri veriniz. */
public class soruDokuz {
	private String kullaniciAdi;
	private String soyadi;
	private int yas;
	

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}


	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}


	public String getSoyadi() {
		return soyadi;
	}


	public void setSoyadi(String sayadi) {
		this.soyadi = sayadi;
	}


	public int getYas() {
		return yas;
	}


	public void setYas(int yas) {
		this.yas = yas;
	}


	public static void main(String[] args) {
		soruDokuz kisi = new soruDokuz();
		kisi.setKullaniciAdi("Öznur");
		System.out.println(kisi.getKullaniciAdi());
		
		kisi.setSoyadi("Özen");
		System.out.println(kisi.getSoyadi());
		
		kisi.setYas(22);
		System.out.println(kisi.getYas());
		
	}

}
