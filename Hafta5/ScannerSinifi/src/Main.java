import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner kullaniciVerisi = new Scanner(System.in);
		 //int türünde kullaným
	    /* System.out.println("Yaþýnýzý Giriniz:");
	     int yas = kullaniciVerisi.nextInt();
         System.out.println("Yaþýnýz:" + yas); */
         
         System.out.println("Adýnýzý Giriniz:");
         String isim = kullaniciVerisi.nextLine();//String için yapilmis nextLine
         System.out.println("Adýnýz:" + isim);
         
         boolean bifade = kullaniciVerisi.nextBoolean();
         double dSayi = kullaniciVerisi.nextDouble();
         byte bSayi = kullaniciVerisi.nextByte();
         float fSayi = kullaniciVerisi.nextFloat();
	}

}
