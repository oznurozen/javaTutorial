
public class Araba {
	public double mevcutKm = 1589; //200
	
	//constructor tanýmlamasý
	
	Araba(){
		System.out.println("Aracýn mevcut kmsi: " + mevcutKm);
	}
	Araba(double yeniKmDegeri){
		mevcutKm = yeniKmDegeri; //2000
		yeniKmDegeri = mevcutKm;
		System.out.println("Aracýn yeni kmsi: " + mevcutKm);
	}
	
	void calistir() {
		System.out.println("Araba Çalýþtý.");
	}


	public static void main(String[] args) {
		Araba  mevcutKm = new Araba();
		 mevcutKm.calistir();
		
		Araba yeniKmDeðeri = new Araba(1800);
		yeniKmDeðeri.calistir();
	}

}
