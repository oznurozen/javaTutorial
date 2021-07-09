package mathSinif;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Abs: " + Math.abs(-8));
		System.out.println("Ceil: " + Math.ceil(2.95)); // YUKARI DOÐRU YUVARLAMA
		System.out.println("Round: " + Math.round(3.25)); //aþaðý doðru yuvarlama
		System.out.println("Floor: " + Math.floor(2.6));
		System.out.println("Max: " + Math.max(5, 4));
		System.out.println("Min: " + Math.min(10, 8));
		System.out.println("PI: " + Math.PI);
		System.out.println("E: " + Math.E);
		System.out.println("Pow: " + Math.pow(2, 4));
		System.out.println("Sqrt: " + Math.sqrt(9));
		System.out.println("Random: " + Math.random());
		System.out.println("sin cos: " + Math.cos(Math.PI / 2) + Math.sin(Math.PI / 2));
		
		/* Ornek: Kullanýcýdan 2 sayý alýnýz. biri negatif bir sayý olsun. Ardýndan kullanýcýya hagi iþlemi
		 *  yaptýrmak istediðini sorunuz ve seçime göre iþlemin çýktýýsný ekrana veriniz.*/
		Scanner kullaniciVerisi = new Scanner(System.in);
		System.out.println("Negaatif bir sayi giriniz: ");
        int sayi1 = kullaniciVerisi.nextInt();
        System.out.println("Bir sayi dahs giriniz: ");
        int sayi2 = kullaniciVerisi.nextInt();
        
        System.out.println("1.abs 2.ceil  3.round");
        System.out.println("Seçmek istediðiniz iþlem: ");
        int islem = kullaniciVerisi.nextInt();
        if(islem==1) {
        	System.out.println("Abs: " +Math.abs(sayi1));
        	System.out.println("Abs: " +Math.abs(sayi2));
        }
        else if(islem==2) {
        	System.out.println("Ceil: " +Math.ceil(sayi1));
        	System.out.println("Ceil: " +Math.ceil(sayi2));
        }
        else if(islem==3) {
        	System.out.println("Round: " +Math.round(sayi1));
        	System.out.println("Round: " +Math.round(sayi2));
        }
       
	}

}
