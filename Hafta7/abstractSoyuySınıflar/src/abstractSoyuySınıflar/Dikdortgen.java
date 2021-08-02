package abstractSoyuySýnýflar;

public class Dikdortgen extends GeometrikSekil {
	private double uzunKenar;
	private double kisaKenar;
	
	public void ozellikler(double uzunKenar, double kisaKenar) {
		isimEkle("dikdötgen");
		this.uzunKenar=uzunKenar;
		this.kisaKenar=kisaKenar;
	}

	@Override
	public double alanHesap() {
		return uzunKenar*kisaKenar;
	}

}
