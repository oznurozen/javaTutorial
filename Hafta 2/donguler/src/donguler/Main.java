package donguler;

public class Main {

	public static void main(String[] args) {
		//While Ornek Soru 1
		int sayii = 5;
		while(sayii>0) {
			sayii--;
			System.out.println(sayii);
			
			
		}
		 //While Ornek Soru 2
		System.out.println("------------------");
		int sayi=0;
		while(sayi<20) {
			sayi=sayi+2;
			System.out.println(sayi);
			
		}
		System.out.println("------------------");
		/*Odev:
		 * �nt t�r�nde iki say� olu�turun. Bu say�lar�n�n birinin de�eri i=10 di�erinin de�eri ise 
		 * ba�lang��ta j=0 olsun. D�ng�n�n ka� kez d�nd���n� ekranda g�stermek i�inde 
		 * bir adet k=0 de�i�keni olu�turun.
		While d�ng�s� i�erisinde i j den b�y�k oldu�u s�rece ekrana ��kt� olarak 
		�i j�den b�y�kt�r� ifadesi yazs�n. Di�er ko�ulda ise art�k b�y�k de�ildir sonucunu versin.
		D�ng� i�erisinde ekrana her i j den b�y�kt�r ifadesi yaz�ld�ktan sonra i de�eri 2 azal�rken,
		 j  2 arts�n. D�ng�ye ka� kere girildi�ini g�stermek i�in ise k de�erini her defas�nda 1 kez artt�r�n.*/
		
		int i = 10, j=0, k = 0;
		
		while(i>0 && j<10 ) {
			i=i-2;
			j=j+2;
			k++;
			if(i>j){
				System.out.println(k + " i de�eri: " + i + " j de�eri: " +j + " i j�den b�y�kt�r ");
			}
			else {
				System.out.println(k + " i de�eri: " + i + " j de�eri: " +j + " i j�den b�y�k de�ildir ");
			}
			
		}
		
		
	}

}
