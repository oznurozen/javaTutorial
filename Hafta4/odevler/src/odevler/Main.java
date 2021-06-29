package odevler;

public class Main {

	public static void main(String[] args) {
		/*aylýk ücretler ve gelir vergilerini tutabildiðiniz iki adet diziniz olsun.
		 *  aylýk ücretler dizisi içerisine 3 adet ondalýklý ücretler giriniz. gelir
		 *   verginizi %30 üzerinden hesaplayabilirsiniz. Örneðin aylýk ücret * 30 / 100 
		 *   iþlemi þeklinde. :) Sonrasýnda ücretleri ve vergilerini ekrana çýktý olarak veriniz.*/
		
		int ucretler[] = {100,1000,10000};
		int gelir = (ucretler[0]*30)/100;
			System.out.println("Ücret :"+gelir);
			
			System.out.println("----------------");
			
		/*Metinsel ifadeler barýndýran bir dizi oluþturmanýzý ve tüm bu diziyi geliþmiþ 
		 * for döngüsü ile çýktý veriniz.*/
			String dizi[] = {"Ali", "Musa","Duygu"};
			for(String i:dizi)
				System.out.println(i);
	}

}
