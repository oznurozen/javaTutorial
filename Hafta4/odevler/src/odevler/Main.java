package odevler;

public class Main {

	public static void main(String[] args) {
		/*ayl�k �cretler ve gelir vergilerini tutabildi�iniz iki adet diziniz olsun.
		 *  ayl�k �cretler dizisi i�erisine 3 adet ondal�kl� �cretler giriniz. gelir
		 *   verginizi %30 �zerinden hesaplayabilirsiniz. �rne�in ayl�k �cret * 30 / 100 
		 *   i�lemi �eklinde. Sonras�nda �cretleri ve vergilerini ekrana ��kt� olarak veriniz.*/
		
		double ucretler[] = {100.20,1000.50,10000.80};
		double gelir = ucretler[1]*30/100;
		for(double i:ucretler)	
			System.out.println("�cret: "+i + " Gelir: " + gelir);
				
			
			System.out.println("----------------");
			
		/*Metinsel ifadeler bar�nd�ran bir dizi olu�turman�z� ve t�m bu diziyi geli�mi� 
		 * for d�ng�s� ile ��kt� veriniz.*/
			String dizi[] = {"Ali", "Musa","Duygu"};
			for(String i:dizi)
				System.out.println(i);
	}

}