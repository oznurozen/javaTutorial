package odev;




public class Main {
/*Bir c�mle olu�turunuz. �rne�in bu "Merhaba Java D�nyas�" olsun. ��indeki bo�luk say�s�,
 *  harf say�s�, tersten yaz�l���, kelime say�s�n� bulan program� yaz�n�z*/
	public static String metin = "Merhaba Java D�nyas�";
	
	public static void tumu() {
		boslukSayisi();
		harfSayisi();
		tersYazi();
		kelimeSayisi();
	}
	

	public static void boslukSayisi() {
		char bosluk =' ' ;
		int boslukSayisi = 0;
		for(int k=0; k<metin.length(); k++){
	    	  if(bosluk==metin.charAt(k)) {
	    		  boslukSayisi++;
	    	  }
	      }
		System.out.println(bosluk + " " + metin+" i�erisindeki bo�luk say�s� " + boslukSayisi + " tanedir.");	
	}
	
	public static void harfSayisi() {
		System.out.println("C�mlede " + (metin.length()-2) + " tane harf bulunmaktad�r.");
	}
	public static void tersYazi() {
		StringBuffer metin = new StringBuffer("Merhaba Java D�nyas�");
		System.out.println(metin.reverse());
		
		
	}
	public static void kelimeSayisi() {
		

    }
		
	
	
	public static void main(String[] args) {

		tumu();

		

	}

}
