package abstractSoyuySýnýflar;

public abstract class GeometrikSekil {
	private String isim;
	
	public void isimEkle(String isim) {
		this.isim=isim;
	}
	
	public String isimGoster() {
		return this.isim;
	}
	public abstract double alanHesap();

	public static void main(String[] args) {
		Dikdortgen dikdortgen = new Dikdortgen();
		Ucgen ucgen = new Ucgen();
		
		dikdortgen.ozellikler(50, 15);
		System.out.println(dikdortgen.isimGoster() + ";n" + dikdortgen.alanHesap());
		
		ucgen.ozellikler(5, 8);
		System.out.println(ucgen.isimGoster() + "; " + ucgen.alanHesap());

	}

}
