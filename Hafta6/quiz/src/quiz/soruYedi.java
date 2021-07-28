package quiz;
//Kullanýcýdan alýnan string bir veriyi do while döngüsü kullanarak ekrana 5 kere yazdýrýnýz. 

import java.util.Scanner;

public class soruYedi {

	public static void main(String[] args) {
		Scanner kullaniciVerisi = new Scanner(System.in);
		 System.out.println("Bir veri giriniz.:");
		 String veri = kullaniciVerisi.next();
		 int say =0;
	        do{
	            System.out.println(veri);
	            say++;
	        }
	        while(say<5);
		
		
	
	}

}
