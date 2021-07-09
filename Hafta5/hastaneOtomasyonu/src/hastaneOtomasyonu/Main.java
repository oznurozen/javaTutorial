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
         String isim = kullaniciVerisi.nextLine();
         
         System.out.println("Soydýnýzý Giriniz: ");
         String soyad = kullaniciVerisi.nextLine();
         
         System.out.println("TC: ");
         Float tc = kullaniciVerisi.nextFloat();
	     
         System.out.println("Telefon: ");
         Float tel = kullaniciVerisi.nextFloat();
         
         System.out.println("Bölüm Seçiniz: ");
         int bolum = kullaniciVerisi.nextInt();
         
         
         System.out.println("Randevu almak istediðiniz tarihi ve saati giriniz: ");
         Short tarih = kullaniciVerisi.nextShort();
         
        
  
         
         System.out.println("Randevunuz Oluþmuþtur.");
         
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
         
         System.out.println(isim +" " + soyad + " " + bolum+" bölümüne "+tarih+ " tarihinde saat "+ " hastanemizde bulununuz.");
         
         
	}

}
