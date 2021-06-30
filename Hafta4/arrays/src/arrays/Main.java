package arrays;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
	/*	int dizi2[];
		dizi2 = new int [] {1,2,3,4,5,6};
		System.out.println(dizi2[0]);
		
		int [] dizi= {1,2,3,4,5};
		
		
		String metin[] = {"Ayþe", "Nisa"};
		
		
		int [] sayi = new int [5];
		sayi[0] = 1;
		sayi[1] = 5;
		sayi[2] = 10;
		sayi[3] = 8;
		sayi[5] = 10;
		
		String [] isim = new String[3];
		isim[0] = "nisa";
		isim[1] = "java";
		isim[2] = "Ahmet"; */
		
		// 1 den 10 a kadar sayýlarý ekrana yazdýran programý yazdýrýnýz.
		int [] dizi= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0; i<dizi.length; i++) {
		System.out.println(dizi[i]);
		}
		
		System.out.println("--------------------");
		
		
		int [] dizi1 = new int[10];
		for(int i=0; i<10; i++) {
			Random random = new Random();
			int sayilar = random.nextInt(100)+1;
			dizi1[i] = sayilar ;
			System.out.println(sayilar);
		}
		
		System.out.println("--------------------");
		
		/*Ýnt türünde bir dizi oluþturun içerisine veriler ekleyin. 
		 * Dizinin kaç elemandan oluþtuðunu ekrana yazdýran programý yazýnýz. */
		int [] sayi= {11,50,2,6,57,60};
		System.out.println(sayi.length);
		
		System.out.println("--------------------");
		
		/*Bir dizi oluþturun vve içerisine 5 adet isim atayýnýz ve ikince
		 *  atadýðýnýz ismini ekrana çýktý veriniz. */
		String [] dizi3 = {"Öznur","Ahmet","Elif","Mehmet","Mustafa"};
		System.out.println(dizi3[1]);
		
		System.out.println("--------------------");
		//GELÝÞMÝÞ FOR DÖNGÜSÜ
		
		int dizi4[] = {1,2,3,4,5};
		for(int i:dizi4)
			System.out.println(i);
		
		System.out.println("--------------------");
		
		int dizi5[] = {1,2,3,4,5};
		for(int i:dizi5)
			System.out.println(3*i);
		
		System.out.println("--------------------");
		
		
	}

}
