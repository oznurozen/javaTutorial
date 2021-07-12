
public class Araba {
	public double mevcutKm = 1589; //200
	
	//constructor tan�mlamas�
	
	Araba(){
		System.out.println("Arac�n mevcut kmsi: " + mevcutKm);
	}
	Araba(double yeniKmDegeri){
		mevcutKm = yeniKmDegeri; //2000
		yeniKmDegeri = mevcutKm;
		System.out.println("Arac�n yeni kmsi: " + mevcutKm);
	}
	
	void calistir() {
		System.out.println("Araba �al��t�.");
	}


	public static void main(String[] args) {
		Araba  mevcutKm = new Araba();
		 mevcutKm.calistir();
		
		Araba yeniKmDe�eri = new Araba(1800);
		yeniKmDe�eri.calistir();
	}

}
