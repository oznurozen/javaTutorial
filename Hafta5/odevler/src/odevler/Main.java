package odevler;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 /*��renci not ortalamas� kald�/ge�ti uygulamas� yap�n�z. burada 100-90 --> �ok iyi,
		 *  80-70 --> iyi 60-50 --> orta 50< kald� desin*/
		 Scanner kullaniciVerisi = new Scanner(System.in);
		 System.out.println("Notunuzu Giriniz:");
	        int not = kullaniciVerisi.nextInt();
	        System.out.println("Sonu�:" + not); 
		 if(not<=100 && not>=90) {
				System.out.println("�ok iyi");
			}
			else if(not<90 && not>=70){
				System.out.println("�yi");
			}
			else if(not<70 && not>=50){
				System.out.println("Orta");
			}
			
			else{
				System.out.println("Kald�n�z");
			}
		 	/*v�cut kitle indeksi hesaplama �rne�i.*/
		    System.out.println("Kilonuzu Giriniz : ");
	        double kilo = kullaniciVerisi.nextDouble();
	        System.out.println("Boyunuzu Giriniz : ");
	        double boy = kullaniciVerisi.nextDouble();
	        boy = boy/100;
	        double vki=kilo/(boy*boy);
	        System.out.println("Sonu�:" + vki);
	        if(vki<18.5) {
				System.out.println("Zay�f");
			}
			else if(vki >= 18.5 && vki <= 24.9){
				System.out.println("Normal");
			}
			else if(vki>24.9 && vki<=29.9){
				System.out.println("Hafif �i�man");
			}
			
			else{
				System.out.println("Obez");
			} 
	        
	        

	}

}
