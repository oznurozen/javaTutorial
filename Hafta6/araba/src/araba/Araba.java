package araba;
/*Araba nesnesi oluştur. Bu araba kişiye özel kategori içerisinde olsun. 
 *Proje içerisinde aracın kullanıcısı, yolcuların yetkileri, özel araç bilgileri(camlar açılabilir, 
 *motor degerleri)yer alsın. Erişim belirteçleri kullanılsın.​*/


public class Araba {
	private String musteri;
	private String aracSahibi;
	public String getMusteri() {
		System.out.println("Müşteri işlemleri.");
		return musteri;
	}

	public void setMusteri(String musteri) {
		this.musteri = musteri;
	}

	public String getAracSahibi() {
		System.out.println("Müşteri işlemleri");
		aracKullanimi();
		cam();
		return aracSahibi;
	}

	public void setAracSahibi(String aracSahibi) {
		this.aracSahibi = aracSahibi;
	}

	Araba(){
		System.out.println("Araç ile yolculuğa çıkıldı.");
	}
	
	private static void aracKullanimi(){
		System.out.println("Araç sahibi arabayı kullandı");
	}
	private static void cam(){
		System.out.println("Camlar açıldı");
	}
	
	public static void main(String[] args) {
		Araba aracKullanimi = new Araba();
		aracKullanimi.setAracSahibi("Öznur");
		System.out.println(aracKullanimi.getAracSahibi());
		
		aracKullanimi.setAracSahibi("Mehmet");
		System.out.println();
		
		
	}

}