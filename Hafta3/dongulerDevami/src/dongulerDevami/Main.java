package dongulerDevami;

public class Main {

	public static void main(String[] args) {

		int dongu = 0;
		while(dongu<10) {
			System.out.println("Hello world!");
			dongu++;
		}
		System.out.println("----------------");
		// 0'dan 100'e kadar olan sayýlarýn toplamýný ekrana veren programý yazýnýz.
		int sayi = 0 , toplam = 0;
		
		do {
			toplam += sayi;
			sayi++;
		}
		while(sayi<=100);
		System.out.println(toplam);
		
		System.out.println("----------------");
		 /*X deðeri 100, y deðeri 40 olan iki deðiþken tanýmlayýnýz. 
        X deðeri y deðerinden küçük olana dek döngü devam etsin 
        ve döngüye her girildiðinde x deðeri 10 azalarak y deðeri 10 artsýn.
        Program çýktýsý olarak bu döngünün kaç kere döndüðünü ekrana yazsýn. */
		int x = 100 , y = 40, z=0;
		do {	
			x = x-10;
			y = y+10;
			z++;
			System.out.println(x+" "+y);
		}
		while(x>y);
		System.out.println("Döngü " + z + " kere döndü.");

		/*ODEV:
		 * 1 den 15 e kadar olan çift sayýlarýn toplamýný ekrana veren programý yazmanýzý 
		 * istiyorum. Burada koþul olarak do while döngüsü kullanýn.
		 */
		int say = 0, top = 0;
		do {
			top += say;
			say=say+2;
			
		}
		while(say<15);
		System.out.println(top);
	}
}
