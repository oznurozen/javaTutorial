package odev;




public class Main {
/*Bir cümle oluþturunuz. Örneðin bu "Merhaba Java Dünyasý" olsun. Ýçindeki boþluk sayýsý,
 *  harf sayýsý, tersten yazýlýþý, kelime sayýsýný bulan programý yazýnýz*/
	public static String metin = "Merhaba Java Dünyasý";
	
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
		System.out.println(bosluk + " " + metin+" içerisindeki boþluk sayýsý " + boslukSayisi + " tanedir.");	
	}
	
	public static void harfSayisi() {
		System.out.println("Cümlede " + (metin.length()-2) + " tane harf bulunmaktadýr.");
	}
	public static void tersYazi() {
		StringBuffer metin = new StringBuffer("Merhaba Java Dünyasý");
		System.out.println(metin.reverse());
		
		
	}
	public static void kelimeSayisi() {
		

    }
		
	
	
	public static void main(String[] args) {

		tumu();

		

	}

}

/*String metin = "Merhaba Java Dersi";
	      char karakterler = 'a' ;
	      int karakterSayisi = 0;
	      for(int k=0; k<metin.length(); k++){
	    	  if(karakterler==metin.charAt(k)) {
	    		  karakterSayisi++;
	    	  }
	      }
	      System.out.println(karakterler + " " + metin+" içerisinde " + karakterSayisi + " tanedir.");
	      
	      *
	      *
	      *String strDizi[] = {"Edirne"," Afyon", "Adapazarý", "Beþiktaþ"};
        System.out.println("String Dizi: " + Arrays.toString(strDizi));
        Arrays.sort(strDizi);
        System.out.println("Sýralý Dizi:"  + Arrays.toString(strDizi));
        */
