package scannerOrnek;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 //Kullanýcýdan sayýsal ve metinsel deðer alarak ekrana yazdýr.
        Scanner kullaniciVerisi = new Scanner(System.in);
        System.out.println("Yaþýnýzý Giriniz:");
        int yas = kullaniciVerisi.nextInt();
        System.out.println("Yaþýnýz:" + yas); 
        
        System.out.println("Adýnýzý Giriniz:");
        String isim = kullaniciVerisi.next();
        System.out.println("Adýnýz:" + isim);
        
      //Boolean kullanýmý 
        System.out.println("Boolean ifade giriniz: true or false");
        boolean bool = kullaniciVerisi.nextBoolean();
        System.out.println(bool);
        
        //Kullanýcýnýn ismini alarak ekrana Hoþ geldin «kullanýcýnýn adý» yazdýr.
        System.out.println("Adýnýzý giriniz:");
        String ad = kullaniciVerisi.next();
        System.out.println("Hoþ geldin " + ad);
        
        //Kullanýcýdan alýnan iki sayýnýn toplamýný ekrana yazdýr.
        System.out.println("1.sayýyý giriniz:");
        int sayi1 = kullaniciVerisi.nextInt();
        System.out.println("2. sayýyý giriniz:");
        int sayi2 = kullaniciVerisi.nextInt();
        System.out.println("Ýki sayýnýn toplamý:" + (sayi1+sayi2));
        
        //Öðrenci not ortalamasý kaldý/geçti uygulamasý yapýnýz.
	}

}
