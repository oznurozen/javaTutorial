package abstractSoyuyS�n�flar;

public class Ucgen extends GeometrikSekil {
	
	private double yukseklik;
	private double taban;
	
	public void ozellikler(double yukseklik, double taban) {
		isimEkle("��gen");
		this.yukseklik=yukseklik;
		this.taban=taban;
	}

	@Override
	public double alanHesap() {
		return(taban*yukseklik)/2;
	}

}
