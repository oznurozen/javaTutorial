package forDongu;

public class Main {

	public static void main(String[] args) {
		//For d�ng�s� kullanarak ekrana 5 adet Merhaba Java program�n� yazd�r�n�z.
		for(int i=1; i<=5; i++) {
			System.out.println("Merhaba Java");
		}
		System.out.println("------------------");
		
		//1�den 100�e kadar olan say�lar� ekrana yazd�ran program� yaz�n�z.
        for(int a=1; a<=100; a++) {

         System.out.print(a+" "); 

        }
        
		System.out.println("------------------");
		
		//1�den 100�e kadar olan t�m tek say�lar� ekrana yazd�ran program� yaz�n�z.
		for(int sayi=1; sayi<=100; sayi+=2) {
			System.out.println(sayi);
		}
		
		
		System.out.println("------------------");
		 
		//1�den 20�ye kadar olan say�lar�n fakt�riyel hesab�n� yaparak ekrana yazd�r�n�z.
		double faktoriyel=1;
	      for(double say=1; say<=20; say++)
	      {
	          faktoriyel*=say;
	          System.out.println(say + "! = "+  faktoriyel);
	      }
	      
	      
	      System.out.println("------------------");
	      
	      
	    //A� dan Z�ye kadar olan harfleri ekrana yazd�r�n�z.
	      for(char harf='A'; harf<='Z'; harf++)
	      {
	          System.out.println(harf);
	      }
	      
	      
	      System.out.println("------------------");
	      
	      //Metinsel bir veri t�r� olu�turun ve bu metnin i�erisine 
	      //�Merhaba Java Dersi� ifadesini ekleyiniz. Bu metinin i�erisinde ka� tane a harfi oldu�unu bulan program� yaz�n�z.
	      String metin = "Merhaba Java Dersi";
	      char karakterler = 'a' ;
	      int karakterSayisi = 0;
	      for(int k=0; k<metin.length(); k++){
	    	  if(karakterler==metin.charAt(k)) {
	    		  karakterSayisi++;
	    	  }
	      }
	      System.out.println(karakterler + " " + metin+" i�erisinde " + karakterSayisi + " tanedir.");
	      
	      System.out.println("------------------");
	      
	      //ODEV: 5�e kadar olan rakamlar� tek tek ekrana basan program� for ve�switch case�metodu kullanarak yaz�n�z.
	      for(int s=5; s<=5; s++) {
	    	  switch (s) {
	    	case 0:
				System.out.println(0);
				break;
			case 1:
				System.out.println(1);
				break;
			case 2:
				System.out.println(2);
				break;
			case 3:
				System.out.println(3);
				break;
			case 4:
				System.out.println(4);
				break;
			case 5:
				System.out.println(5);
				break;


			}
				
			}
	}

}
