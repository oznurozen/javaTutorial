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
         String isim = kullaniciVerisi.nextLine();
         
         System.out.println("Soyd�n�z� Giriniz: ");
         String soyad = kullaniciVerisi.nextLine();
         
         System.out.println("TC: ");
         Float tc = kullaniciVerisi.nextFloat();
	     
         System.out.println("Telefon: ");
         Float tel = kullaniciVerisi.nextFloat();
         
         System.out.println("B�l�m Se�iniz: ");
         int bolum = kullaniciVerisi.nextInt();
         
         
         System.out.println("Randevu almak istedi�iniz tarihi ve saati giriniz: ");
         Short tarih = kullaniciVerisi.nextShort();
         
        
  
         
         System.out.println("Randevunuz Olu�mu�tur.");
         
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
         
         System.out.println(isim +" " + soyad + " " + bolum+" b�l�m�ne "+tarih+ " tarihinde saat "+ " hastanemizde bulununuz.");
         
         
	}

}
