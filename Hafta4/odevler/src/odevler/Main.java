package odevler;

import java.util.Arrays;

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
			
			System.out.println("----------------");
		/*Beþ ayrý dizi tanýmlayalým.
		1. dizinin elemanlarý Pazartesi, Salý, Çarþamba olsun.
		2. dizinin  elemanlarý 1. dizi ile ayný olsun.
		3. dizinin  elemanlarý Cumartesi ve Pazar olsun.
		4. dizinin  elemanlarý PAZARTESÝ, SALI ve ÇARÞAMBA olsun.
		5. diziyi de 2. diziyi ona atayarak tanýmlayalým.
		Sonra dizileri birbirleriyle sýrasýyla karþýlaþtýralým sonrasýnda da 1. dizideki salý ifadesinin kaçýncý indis deðerine sahip olduðunu bulalým.*/
			
			String [] hafta1 = {"Pazartesi","Salý","Carþamba"};
			String [] hafta2 = {"Pazartesi","Salý","Çarþamba"};
			String [] hafta3 = {"Cumartesi","PAZAR"};
			String [] hafta4 = {"PAZARTESÝ","SALI","ÇARÞAMBA"};
			String [] hafta5 = hafta2;
			System.out.println("1." + Arrays.equals(dizi1, dizi2));
			System.out.println("2." + Arrays.equals(dizi1, dizi3));
			System.out.println("3." + Arrays.equals(dizi4, dizi5));
	}

}