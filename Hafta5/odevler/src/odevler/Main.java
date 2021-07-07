package odevler;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 /*Öðrenci not ortalamasý kaldý/geçti uygulamasý yapýnýz. burada 100-90 --> çok iyi,
		 *  80-70 --> iyi 60-50 --> orta 50< kaldý desin*/
		 Scanner kullaniciVerisi = new Scanner(System.in);
		 System.out.println("Notunuzu Giriniz:");
	        int not = kullaniciVerisi.nextInt();
	        System.out.println("Sonuç:" + not); 
		 if(not<=100 && not>=90) {
				System.out.println("Çok iyi");
			}
			else if(not<90 && not>=70){
				System.out.println("Ýyi");
			}
			else if(not<70 && not>=50){
				System.out.println("Orta");
			}
			
			else{
				System.out.println("Kaldýnýz");
			}
		 	/*vücut kitle indeksi hesaplama örneði.*/
		    System.out.println("Kilonuzu Giriniz : ");
	        double kilo = kullaniciVerisi.nextDouble();
	        System.out.println("Boyunuzu Giriniz : ");
	        double boy = kullaniciVerisi.nextDouble();
	        boy = boy/100;
	        double vki=kilo/(boy*boy);
	        System.out.println("Sonuç:" + vki);
	        if(vki<18.5) {
				System.out.println("Zayýf");
			}
			else if(vki >= 18.5 && vki <= 24.9){
				System.out.println("Normal");
			}
			else if(vki>24.9 && vki<=29.9){
				System.out.println("Hafif Þiþman");
			}
			
			else{
				System.out.println("Obez");
			} 
	        
	        

	}

}
