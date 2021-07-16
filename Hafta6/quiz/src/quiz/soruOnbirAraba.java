package quiz;
/*Kapsülleme kullanarak bir araba sýnýfý oluþturun ve güvenliði saðlamak için gerekli metodlarý 
 * kullanmayý unutmayýn. Ardýndan araba markasý, modeli, kmsi ve yaþý gibi bilgilerini çýktý olarak verin. */
public class soruOnbirAraba {
	
	public String marka="Ford";
	public String model="Focus";
	private double mevcutKm;
	private int yas;

	
	public double getMevcutKm() {
		return mevcutKm;
	}


	public void setMevcutKm(double mevcutKm) {
		this.mevcutKm = mevcutKm;
	}


	public int getYas() {
		return yas;
	}


	public void setYas(int yas) {
		this.yas = yas;
	}


	public static void main(String[] args) {
		
		soruOnbirAraba araba = new soruOnbirAraba();
		System.out.println(araba.marka + " "+ araba.model);
		
		araba.setMevcutKm(3500);
		System.out.println(araba.getMevcutKm());
		
		araba.setYas(25);
		System.out.println(araba.getYas());
		
		
	}

}
