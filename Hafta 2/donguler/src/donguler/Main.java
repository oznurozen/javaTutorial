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
		 * Ýnt türünde iki sayý oluþturun. Bu sayýlarýnýn birinin deðeri i=10 diðerinin deðeri ise 
		 * baþlangýçta j=0 olsun. Döngünün kaç kez döndüðünü ekranda göstermek içinde 
		 * bir adet k=0 deðiþkeni oluþturun.
		While döngüsü içerisinde i j den büyük olduðu sürece ekrana çýktý olarak 
		«i j’den büyüktür» ifadesi yazsýn. Diðer koþulda ise artýk büyük deðildir sonucunu versin.
		Döngü içerisinde ekrana her i j den büyüktür ifadesi yazýldýktan sonra i deðeri 2 azalýrken,
		 j  2 artsýn. Döngüye kaç kere girildiðini göstermek için ise k deðerini her defasýnda 1 kez arttýrýn.*/
		
		int i = 10, j=0, k = 0;
		
		while(i>0 && j<10 ) {
			i=i-2;
			j=j+2;
			k++;
			if(i>j){
				System.out.println(k + " i deðeri: " + i + " j deðeri: " +j + " i j’den büyüktür ");
			}
			else {
				System.out.println(k + " i deðeri: " + i + " j deðeri: " +j + " i j’den büyük deðildir ");
			}
			
		}
		
		
	}

}
