package abstractSoyuyS�n�flar;

public class Dikdortgen extends GeometrikSekil {
	private double uzunKenar;
	private double kisaKenar;
	
	public void ozellikler(double uzunKenar, double kisaKenar) {
		isimEkle("dikd�tgen");
		this.uzunKenar=uzunKenar;
		this.kisaKenar=kisaKenar;
	}

	@Override
	public double alanHesap() {
		return uzunKenar*kisaKenar;
	}

}
