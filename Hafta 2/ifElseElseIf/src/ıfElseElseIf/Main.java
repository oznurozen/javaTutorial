package �fElseElseIf;

public class Main {

	public static void main(String[] args) {
		/* SORU 1
        1 adet not de�i�keni olu�turun. 
        Ard�ndan bu girilen notun 50 den b�y�k olmas� durumunda ge�ti, 
        d���k olmas� durumunda kald� yaz�s�n� ekrana yazd�r�n. */
		
		int not = 70;
		if(not>=50) {
			System.out.println("Ge�ti");
		}
		else {
			System.out.println("Kald�");
		}
		System.out.println("-----------------");
		/* SORU 2
        �ki adet say� tan�mlay�n�z ve bu say�lar�n birbirine e�it olmas� durumunda
        ekrana bu iki say� e�ittir yaz�s�n� verin, e�itsizlik durumunda ise 
        bu iki say� birbirine e�it de�ildir yaz�s� ekrana gelsin. */
		
		int sayi1=20, sayi2=30;
		if(sayi1==sayi2) {
			System.out.println("Bu iki say� birbirine e�ittir.");
		}
		else {
			System.out.println("Bu iki say� birbirine e�it de�ildir.");
		}
		System.out.println("-----------------");
		// SORU 3
	       // 2 adet say� tan�mlay�n�z ve bu say�lardan b�y�k olan� ekrana yazd�r�n�z.
		
		int sayi3=20, sayi4=30;
		if(sayi3>sayi4) {
			System.out.println(sayi3);
		}
		else {
			System.out.println(sayi4);
		}
		System.out.println("-----------------");
		// SORU 4
	    // Bir de�i�ken i�erisinde say� de�eri atay�n�z. Ard�ndan bu say�n�n �ift mi yoksa tek say� m� oldu�unu ekrana yazd�r�n�z.
		int sayi5 = 90;
		if(sayi5%2==0) {
			System.out.println("sayi �ifttir");
		}
		else {
			System.out.println("say� tektir");
		}
		System.out.println("-----------------");
		// SORU 5
        //��rencinin harf notunu hesaplayan program� yaz�n�z.
        //100-90 aras� AA
        // 89-70 aras� BB
        //69-50 aras� CC
        //49-30 aras� DD
        // 30< FF
		
		int not1=60;
		if(not1<=100 && not1>=90) {
			System.out.println("AA");
		}
		else if(not1<90 && not1>=70){
			System.out.println("BB");
		}
		else if(not1<70 && not1>=50){
			System.out.println("CC");
		}
		else if(not<50 && not1>=30){
			System.out.println("DD");
		}
		else{
			System.out.println("FF");
		}
		
		System.out.println("-----------------");
		//SORU 6
        /* do�ru ve yanlis ismiyle 2 adet de�i�ken olu�turun ve bunlara birer de�er atay�n. 
        4 yanl�� 1 do�ruyu g�t�recek �eklinde net hesaplamas�n� ger�ekle�tiriniz.
        E�er net 85 e e�it ve b�y�kse �ok ba�ar�l�,
        E�er 75 e e�it ve 85 den k���k ise iyi seviye,
        E�er 55 e e�it ve 75 den k���k ise orta seviye
        E�er 55 den k���k ise k�t� seviye olarak belirterek toplam net say�s�n� ekrana yazd�r�n. */
		
		int dogru = 80;
		int yanl�s = 40;
		float net = dogru-(yanl�s/4);
		System.out.println("Toplam net say�s�:"+net);
		if(net>=85) {
			System.out.println("�ok ba�ar�l�");
		}
		else if(net<85 && net>=75){
			System.out.println("k���k ise");
		}
		else if(net<75 && net>=55){
			System.out.println("orta seviye");
		}
		else{
			System.out.println("k�t� seviye");
		}
		
		System.out.println("-----------------");
		/*Odev1:
		 * 3 tane ��renci olu�turun ve bu 3 ��renciye not atamas� ger�ekle�tirin ard�ndan bu 3 ��rencinin 
		 * notlar�n� kar��la�t�rarak en y�ksek nota sahip olan ��renciyi ekrana yazd�r�n*/
		
		int ogrenci1 = 90;
		int ogrenci2 = 10;
		int ogrenci3 = 95;
		
		
		if(ogrenci1>ogrenci2 && ogrenci1>ogrenci3) {
			
			System.out.println("En Y�ksek Not = " + ogrenci1);
		}
		else if(ogrenci2>ogrenci1 && ogrenci2>ogrenci3) {
			System.out.println("En Y�ksek Not = " + ogrenci2);
		}
		else {
			System.out.println("En Y�ksek Not = " + ogrenci3);
		}
		
		System.out.println("-----------------");
		/*Odev2:
		 * 5 sayi degiskeni olusturun, i�lerine de�erlerini atay�n ve bu say�lar� 7 say�s� ile �arpma
		 *  i�lemine tabii tutun �arpma i�leminin ard�ndan tek olan say�lar� ekrana yazd�rmaya �al���n.*/
		
		int a =20, b=31, c=41, d=50, e=61;
		int sonuc1= 7*a, sonuc2= 7*b, sonuc3= 7*c, sonuc4= 7*d, sonuc5= 7*e;
		
				if(sonuc1%2!=0) {
					System.out.println(sonuc1 + " sayi tektir");
				}
				if(sonuc2%2!=0) {
					System.out.println(sonuc2 + " sayi tektir");
				}
				if(sonuc3%2!=0) {
					System.out.println(sonuc3 + " sayi tektir");
				}
				if(sonuc4%2!=0) {
					System.out.println(sonuc4 + " sayi tektir");
				}
				if(sonuc5%2!=0) {
					System.out.println(sonuc5 + " sayi tektir");
				}
				System.out.println("-----------------");
				
		int h�z = 1000;
		if(h�z>90) {
			System.out.println("Radara Girdiniz");
			
			if(h�z>=90 && h�z<120) {
				System.out.println("Cezan�z 200TL");
			}
			else if(h�z>=120) {
				System.out.println("Cezan�z 400TL");
			}
			
		}
		else {
			System.out.println("H�z�n�z normal");
		}
		
		
				
	}

}
