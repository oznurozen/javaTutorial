import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner kullaniciVerisi = new Scanner(System.in);
		 //int t�r�nde kullan�m
	    /* System.out.println("Ya��n�z� Giriniz:");
	     int yas = kullaniciVerisi.nextInt();
         System.out.println("Ya��n�z:" + yas); */
         
         System.out.println("Ad�n�z� Giriniz:");
         String isim = kullaniciVerisi.nextLine();//String i�in yapilmis nextLine
         System.out.println("Ad�n�z:" + isim);
         
         boolean bifade = kullaniciVerisi.nextBoolean();
         double dSayi = kullaniciVerisi.nextDouble();
         byte bSayi = kullaniciVerisi.nextByte();
         float fSayi = kullaniciVerisi.nextFloat();
	}

}
