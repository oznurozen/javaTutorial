package quiz;
//Kullan�c�dan al�nan string bir veriyi do while d�ng�s� kullanarak ekrana 5 kere yazd�r�n�z. 

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
