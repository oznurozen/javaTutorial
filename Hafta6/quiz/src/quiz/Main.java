package quiz;

import java.util.Scanner;



public class Main {
	
	
	public static void main(String[] args) {
		//Girilen stringi tersten yazdıran programı yazınız. (Kullanıcıdan alınsın.)
		/*Scanner kullaniciVerisi = new Scanner(System.in);
		 System.out.println("Cümleyi Giriniz:");
		 String cumle = kullaniciVerisi.next();
		 
		 String tersSonuc = "";
	        for(int i=cumle.length()-1; i>=0; i--){
	            tersSonuc+=cumle.charAt(i);
	        }
	        System.out.println(tersSonuc);*/
		
		//Girilen string’te kaç tane a olduğunu bulan programı yazınız. (Kullanıcıdan alınsın.)
		Scanner kullaniciVerisi = new Scanner (System.in);
		System.out.println("Girilen kelime");
		String kelime = kullaniciVerisi.next();
		char harf ='a' ;
		int harfSayisi = 0;
		for(int k=0; k<kelime.length(); k++){
	    	  if(harf==kelime.charAt(k)) {
	    		  harfSayisi++;
	    	  }
	    	  
		 }
		System.out.println("Girilen kelime içerisinde " + harfSayisi + " tane a harfi vardır.");
		
		
	}
}