package switchCase;

public class Main {

	public static void main(String[] args) {
		//SORU 1
	       /*Switch Case kullanarak 1� den 10 a kadar case olu�turun ve 
	        tan�mlanm�� olan say�n�n ka� oldu�unu ekrana yazd�r�n. */
	       int sayi = 1;
	       switch(sayi){
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
	           
	           default : 
	               System.out.println("Say� Bulunamad�");
	       }
	       System.out.println("---------------");
	       /*Odev1:
	        *  Switch case kullanarak 12 ay i�in case metodlar� olu�turun.
	        *  Se�ilmi� olan ay�� ekrana yazd�r�n.*/
	       
	       int ay = 11;
	       
	       switch(ay){
           case 1:
               System.out.println("Ocak");
               break;
           case 2:
               System.out.println("�ubat");
               break;
           case 3:
               System.out.println("Mart");
               break;
           case 4:
               System.out.println("Nisan");
               break;
           case 5:
               System.out.println("May�s");
               break;
           case 6:
               System.out.println("Haziran");
               break;
           case 7:
               System.out.println("Temmuz");
               break;
           case 8:
               System.out.println("A�ustos");
               break;
           case 9:
               System.out.println("Eyl�l");
               break;
           case 10:
               System.out.println("Ekim");
               break;
           case 11:
               System.out.println("Kas�m");
               break;
           case 12:
               System.out.println("Aral�k");
               break;
	       
	       } 
	       
	       System.out.println("---------------");
	       
	       /*Odev2:
	        * Switch case mant��� ile 1 ila 10 aras�nda girilmi� olan bir say�n�n �ift ve tek olma durumuna bak�n�z.*/
	       int sayii = 1;
	       switch(sayii){
	           case 1:
	          		System.out.println("say� tektir");
	          		break;
	           case 3:
	               System.out.println("say� tektir");
	               break;
	           case 5:
	               System.out.println("say� tektir");
	               break;
	           case 7:
	               System.out.println("say� tektir");
	               break;
	           case 9:
	               System.out.println("say� tektir");
	               break;
	           
	           default : 
	               System.out.println("�ift Say�d�r");
	       }
	       System.out.println("---------------");
	       
	       /*Odev3:
	        * Switch case i kullanarak girilen string ifade ile ay verisi olu�turun. Girilen ay��n ka��nc� ay oldu�unu ekran yazd�ran program� yaz�n�z.*/
	       String ay1 = "Ocak";
	       switch(ay1){
           case "Ocak":
               System.out.println("1.ay");
               break;
           case "�ubat":
               System.out.println("2.ay");
               break;
           case "Mart":
               System.out.println("3.ay");
               break;
           case "Nisan":
               System.out.println("4.ay");
               break;
           case "May�s":
               System.out.println("5.ay");
               break;
           case "Haziran":
               System.out.println("6.ay");
               break;
           case "Temmuz":
               System.out.println("7.ay");
               break;
           case "A�ustos":
               System.out.println("8.ay");
               break;
           case "Eyl�l":
               System.out.println("9.ay");
               break;
           case "Ekim":
               System.out.println("10.ay");
               break;
           case "Kas�m":
               System.out.println("11.ay");
               break;
           case "Aral�k":
               System.out.println("12.ay");
               break;
	       
	       } 
	}

}
