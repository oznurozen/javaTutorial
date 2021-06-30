package odevler;

public class Main {

	public static void main(String[] args) {
		/*aylýk ücretler ve gelir vergilerini tutabildiðiniz iki adet diziniz olsun.
		 *  aylýk ücretler dizisi içerisine 3 adet ondalýklý ücretler giriniz. gelir
		 *   verginizi %30 üzerinden hesaplayabilirsiniz. Örneðin aylýk ücret * 30 / 100 
		 *   iþlemi þeklinde. Sonrasýnda ücretleri ve vergilerini ekrana çýktý olarak veriniz.*/
		
		double [] ucretler = new double[3];
		ucretler[0]=200.85;
		ucretler[1]=500.80;
		ucretler[2]=850.95;
		
		double [] gelirVergisi = new double[3];
		for(int i=0; i<ucretler.length; i++) {
			gelirVergisi[i] = ucretler[i]*30/100;
			System.out.println(ucretler[i] + " gelir vergisi: " + gelirVergisi[i]);
		}
		
			System.out.println("----------------");
			
		/*Metinsel ifadeler barýndýran bir dizi oluþturmanýzý ve tüm bu diziyi geliþmiþ 
		 * for döngüsü ile çýktý veriniz.*/
			String dizi[] = {"Ali", "Musa","Duygu"};
			for(String i:dizi)
				System.out.println(i);
	}

}