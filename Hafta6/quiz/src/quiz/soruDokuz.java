package quiz;


/*private olarak kullan�c� ad�, soyad� ve ya�� olu�turunuz. setter ve getter 
 * metodlar� ile eri�imi a��k hale getirerek kullan�c�dan al�nan ad soyad ve ya� bilgisini 
 * private de�i�kenler i�erisine aktar�n�z ve ��kt� olarak kullan�c�dan al�nan verileri veriniz. */
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
		kisi.setKullaniciAdi("�znur");
		System.out.println(kisi.getKullaniciAdi());
		
		kisi.setSoyadi("�zen");
		System.out.println(kisi.getSoyadi());
		
		kisi.setYas(22);
		System.out.println(kisi.getYas());
		
	}

}
