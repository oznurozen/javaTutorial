package scannerOrnek;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 //Kullan�c�dan say�sal ve metinsel de�er alarak ekrana yazd�r.
        Scanner kullaniciVerisi = new Scanner(System.in);
        System.out.println("Ya��n�z� Giriniz:");
        int yas = kullaniciVerisi.nextInt();
        System.out.println("Ya��n�z:" + yas); 
        
        System.out.println("Ad�n�z� Giriniz:");
        String isim = kullaniciVerisi.next();
        System.out.println("Ad�n�z:" + isim);
        
      //Boolean kullan�m� 
        System.out.println("Boolean ifade giriniz: true or false");
        boolean bool = kullaniciVerisi.nextBoolean();
        System.out.println(bool);
        
        //Kullan�c�n�n ismini alarak ekrana Ho� geldin �kullan�c�n�n ad�� yazd�r.
        System.out.println("Ad�n�z� giriniz:");
        String ad = kullaniciVerisi.next();
        System.out.println("Ho� geldin " + ad);
        
        //Kullan�c�dan al�nan iki say�n�n toplam�n� ekrana yazd�r.
        System.out.println("1.say�y� giriniz:");
        int sayi1 = kullaniciVerisi.nextInt();
        System.out.println("2. say�y� giriniz:");
        int sayi2 = kullaniciVerisi.nextInt();
        System.out.println("�ki say�n�n toplam�:" + (sayi1+sayi2));
        
        //��renci not ortalamas� kald�/ge�ti uygulamas� yap�n�z.
	}

}
