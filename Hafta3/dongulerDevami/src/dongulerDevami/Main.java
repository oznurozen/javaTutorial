package dongulerDevami;

public class Main {

	public static void main(String[] args) {

		int dongu = 0;
		while(dongu<10) {
			System.out.println("Hello world!");
			dongu++;
		}
		System.out.println("----------------");
		// 0'dan 100'e kadar olan say�lar�n toplam�n� ekrana veren program� yaz�n�z.
		int sayi = 0 , toplam = 0;
		
		do {
			toplam += sayi;
			sayi++;
		}
		while(sayi<=100);
		System.out.println(toplam);
		
		System.out.println("----------------");
		 /*X de�eri 100, y de�eri 40 olan iki de�i�ken tan�mlay�n�z. 
        X de�eri y de�erinden k���k olana dek d�ng� devam etsin 
        ve d�ng�ye her girildi�inde x de�eri 10 azalarak y de�eri 10 arts�n.
        Program ��kt�s� olarak bu d�ng�n�n ka� kere d�nd���n� ekrana yazs�n. */
		int x = 100 , y = 40, z=0;
		do {	
			x = x-10;
			y = y+10;
			z++;
			System.out.println(x+" "+y);
		}
		while(x>y);
		System.out.println("D�ng� " + z + " kere d�nd�.");

		/*ODEV:
		 * 1 den 15 e kadar olan �ift say�lar�n toplam�n� ekrana veren program� yazman�z� 
		 * istiyorum. Burada ko�ul olarak do while d�ng�s� kullan�n.
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
