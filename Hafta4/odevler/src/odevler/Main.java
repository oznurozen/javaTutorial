package odevler;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		/*ayl�k �cretler ve gelir vergilerini tutabildi�iniz iki adet diziniz olsun.
		 *  ayl�k �cretler dizisi i�erisine 3 adet ondal�kl� �cretler giriniz. gelir
		 *   verginizi %30 �zerinden hesaplayabilirsiniz. �rne�in ayl�k �cret * 30 / 100 
		 *   i�lemi �eklinde. Sonras�nda �cretleri ve vergilerini ekrana ��kt� olarak veriniz.*/
		
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
			
		/*Metinsel ifadeler bar�nd�ran bir dizi olu�turman�z� ve t�m bu diziyi geli�mi� 
		 * for d�ng�s� ile ��kt� veriniz.*/
			String dizi[] = {"Ali", "Musa","Duygu"};
			for(String i:dizi)
				System.out.println(i);
			
			System.out.println("----------------");
		/*Be� ayr� dizi tan�mlayal�m.
		1. dizinin elemanlar� Pazartesi, Sal�, �ar�amba olsun.
		2. dizinin  elemanlar� 1. dizi ile ayn� olsun.
		3. dizinin  elemanlar� Cumartesi ve Pazar olsun.
		4. dizinin  elemanlar� PAZARTES�, SALI ve �AR�AMBA olsun.
		5. diziyi de 2. diziyi ona atayarak tan�mlayal�m.
		Sonra dizileri birbirleriyle s�ras�yla kar��la�t�ral�m sonras�nda da 1. dizideki sal� ifadesinin ka��nc� indis de�erine sahip oldu�unu bulal�m.*/
			
			String [] hafta1 = {"Pazartesi","Sal�","Car�amba"};
			String [] hafta2 = {"Pazartesi","Sal�","�ar�amba"};
			String [] hafta3 = {"Cumartesi","PAZAR"};
			String [] hafta4 = {"PAZARTES�","SALI","�AR�AMBA"};
			String [] hafta5 = hafta2;
			System.out.println("1." + Arrays.equals(dizi1, dizi2));
			System.out.println("2." + Arrays.equals(dizi1, dizi3));
			System.out.println("3." + Arrays.equals(dizi4, dizi5));
	}

}