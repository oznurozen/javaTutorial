package hastaneOtomasyonu;

import java.util.Scanner;

public class Main {
	/*Hastane bilgi sistemi otomasyonu oluþturun.
		Kullanýcýdan adýný, soyadýný, tc kimlik numarasýný, telefon numarasýný alýnýz.
		Randevu alabileceði 5 adet bölüm oluþturun ve hangi bölümden randevu alacaðý sorusunu hastaya yönlendirerek cevabýný alýnýz.
		Hastanýn cevabýný aldýktan sonra hangi tarihte randevu almak istediðini ve saati bilgisini alýn.
		Randevunuz oluþturulmuþtur ekran yazýsýný ekrana verdikten sonra
		ekran çýktýsý olarak Randevu Bilgileriniz:
		hastanýn adý soyadý, randevu aldýðý bölüm, tarih ve saati bulunsun.*/

	public static void main(String[] args) {
		 Scanner kullaniciVerisi = new Scanner(System.in);
		 System.out.println("Adýnýzý Giriniz: ");
         String isim = kullaniciVerisi.next();
         
         System.out.println("Soydýnýzý Giriniz: ");
         String soyad = kullaniciVerisi.next();
         
         System.out.println("TC: ");
         long tc = kullaniciVerisi.nextLong();
	     
         System.out.println("Telefon: ");
         long tel = kullaniciVerisi.nextLong();
         
         System.out.println("1.Kardiyoloji 2.Dahiliye  3.Göz Hastalýklarý  4.Cildiye  5.Ortopedi");
         System.out.println("Bölüm Seçiniz: ");
         int bolum = kullaniciVerisi.nextInt();
         if(bolum==1) {
	        	System.out.println("Kardiyoloji");
	        }
	        else if(bolum==2) {
	        	System.out.println("Dahiliye");
	        }
	        else if(bolum==3) {
	        	System.out.println("Göz Hastalýklarý");
	        }
	        else if(bolum==4) {
	        	System.out.println("Cildiye");
	        }
	        else if(bolum==5) {
	        	System.out.println("Ortopedi");
	        }
         
         
         System.out.println("Randevu almak istediðiniz tarihi giriniz: ");
         String tarih = kullaniciVerisi.next();
         
         System.out.println("Randevu almak istediðiniz saati giriniz: ");
         String saat = kullaniciVerisi.next();
         
        
  
         
         System.out.println("Randevunuz Oluþmuþtur.");
         
         
         
         System.out.println(isim +" " + soyad + "\n " + bolum+" bölümüne "+tarih+ " tarihinde saat "+ saat+ " da hastanemizde bulununuz.");
         
         
	}

}
