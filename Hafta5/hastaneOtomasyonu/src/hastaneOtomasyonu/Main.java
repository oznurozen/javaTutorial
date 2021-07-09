package hastaneOtomasyonu;

import java.util.Scanner;

public class Main {
	/*Hastane bilgi sistemi otomasyonu olu�turun.
		Kullan�c�dan ad�n�, soyad�n�, tc kimlik numaras�n�, telefon numaras�n� al�n�z.
		Randevu alabilece�i 5 adet b�l�m olu�turun ve hangi b�l�mden randevu alaca�� sorusunu hastaya y�nlendirerek cevab�n� al�n�z.
		Hastan�n cevab�n� ald�ktan sonra hangi tarihte randevu almak istedi�ini ve saati bilgisini al�n.
		Randevunuz olu�turulmu�tur ekran yaz�s�n� ekrana verdikten sonra
		ekran ��kt�s� olarak Randevu Bilgileriniz:
		hastan�n ad� soyad�, randevu ald��� b�l�m, tarih ve saati bulunsun.*/

	public static void main(String[] args) {
		 Scanner kullaniciVerisi = new Scanner(System.in);
		 System.out.println("Ad�n�z� Giriniz: ");
         String isim = kullaniciVerisi.next();
         
         System.out.println("Soyd�n�z� Giriniz: ");
         String soyad = kullaniciVerisi.next();
         
         System.out.println("TC: ");
         long tc = kullaniciVerisi.nextLong();
	     
         System.out.println("Telefon: ");
         long tel = kullaniciVerisi.nextLong();
         
         System.out.println("1.Kardiyoloji 2.Dahiliye  3.G�z Hastal�klar�  4.Cildiye  5.Ortopedi");
         System.out.println("B�l�m Se�iniz: ");
         int bolum = kullaniciVerisi.nextInt();
         if(bolum==1) {
	        	System.out.println("Kardiyoloji");
	        }
	        else if(bolum==2) {
	        	System.out.println("Dahiliye");
	        }
	        else if(bolum==3) {
	        	System.out.println("G�z Hastal�klar�");
	        }
	        else if(bolum==4) {
	        	System.out.println("Cildiye");
	        }
	        else if(bolum==5) {
	        	System.out.println("Ortopedi");
	        }
         
         
         System.out.println("Randevu almak istedi�iniz tarihi giriniz: ");
         String tarih = kullaniciVerisi.next();
         
         System.out.println("Randevu almak istedi�iniz saati giriniz: ");
         String saat = kullaniciVerisi.next();
         
        
  
         
         System.out.println("Randevunuz Olu�mu�tur.");
         
         
         
         System.out.println(isim +" " + soyad + "\n " + bolum+" b�l�m�ne "+tarih+ " tarihinde saat "+ saat+ " da hastanemizde bulununuz.");
         
         
	}

}
