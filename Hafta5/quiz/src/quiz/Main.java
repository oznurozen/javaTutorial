package quiz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int sayi=0;
		while(sayi<100) {
			sayi=sayi+10;
			System.out.println(sayi);
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("�znur");
		}
		
		int a = 50;
		while(a<100) {
			a=a+5;
			System.out.println(a);
		}
		 Scanner kullaniciVerisi = new Scanner(System.in);
		System.out.println("1.say�y� giriniz:");
	        int deger1 = kullaniciVerisi.nextInt();
	        System.out.println("2. say�y� giriniz:");
	        int deger2 = kullaniciVerisi.nextInt();
	        System.out.println("yapmak istedi�iniz i�lemi giriniz.");
	        int islem = kullaniciVerisi.nextInt();
	        
	        if(islem==1) {
	        	System.out.println("Toplam "+ (deger1+deger2));
	        }
	        else if(islem==2) {
	        	System.out.println("��kar:" +(deger1-deger2) );
	        }
	        else if(islem==3) {
	        	System.out.println("�arp" + (deger1*deger2));
	        }
	        else if(islem==4) {
	        	System.out.println("B�l:" + (deger1/deger2));
	        }
		 
		 
		   System.out.println("Do�um y�l�n�z� giriniz:");
	        int dogum = kullaniciVerisi.nextInt();
	        System.out.println("Bu g�n�n Tarihi:");
	        int bugun = kullaniciVerisi.nextInt();
	        int yas = bugun-dogum;
	        System.out.println("Yasiniz:" +yas);
	        
	       

	}

}
