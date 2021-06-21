package switchCase;

public class Main {

	public static void main(String[] args) {
		//SORU 1
	       /*Switch Case kullanarak 1’ den 10 a kadar case oluþturun ve 
	        tanýmlanmýþ olan sayýnýn kaç olduðunu ekrana yazdýrýn. */
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
	               System.out.println("Sayý Bulunamadý");
	       }
	       System.out.println("---------------");
	       /*Odev1:
	        *  Switch case kullanarak 12 ay için case metodlarý oluþturun.
	        *  Seçilmiþ olan ay’ý ekrana yazdýrýn.*/
	       
	       int ay = 11;
	       
	       switch(ay){
           case 1:
               System.out.println("Ocak");
               break;
           case 2:
               System.out.println("Þubat");
               break;
           case 3:
               System.out.println("Mart");
               break;
           case 4:
               System.out.println("Nisan");
               break;
           case 5:
               System.out.println("Mayýs");
               break;
           case 6:
               System.out.println("Haziran");
               break;
           case 7:
               System.out.println("Temmuz");
               break;
           case 8:
               System.out.println("Aðustos");
               break;
           case 9:
               System.out.println("Eylül");
               break;
           case 10:
               System.out.println("Ekim");
               break;
           case 11:
               System.out.println("Kasým");
               break;
           case 12:
               System.out.println("Aralýk");
               break;
	       
	       } 
	       
	       System.out.println("---------------");
	       
	       /*Odev2:
	        * Switch case mantýðý ile 1 ila 10 arasýnda girilmiþ olan bir sayýnýn çift ve tek olma durumuna bakýnýz.*/
	       int sayii = 1;
	       switch(sayii){
	           case 1:
	          		System.out.println("sayý tektir");
	          		break;
	           case 3:
	               System.out.println("sayý tektir");
	               break;
	           case 5:
	               System.out.println("sayý tektir");
	               break;
	           case 7:
	               System.out.println("sayý tektir");
	               break;
	           case 9:
	               System.out.println("sayý tektir");
	               break;
	           
	           default : 
	               System.out.println("Çift Sayýdýr");
	       }
	       System.out.println("---------------");
	       
	       /*Odev3:
	        * Switch case i kullanarak girilen string ifade ile ay verisi oluþturun. Girilen ay’ýn kaçýncý ay olduðunu ekran yazdýran programý yazýnýz.*/
	       String ay1 = "Ocak";
	       switch(ay1){
           case "Ocak":
               System.out.println("1.ay");
               break;
           case "Þubat":
               System.out.println("2.ay");
               break;
           case "Mart":
               System.out.println("3.ay");
               break;
           case "Nisan":
               System.out.println("4.ay");
               break;
           case "Mayýs":
               System.out.println("5.ay");
               break;
           case "Haziran":
               System.out.println("6.ay");
               break;
           case "Temmuz":
               System.out.println("7.ay");
               break;
           case "Aðustos":
               System.out.println("8.ay");
               break;
           case "Eylül":
               System.out.println("9.ay");
               break;
           case "Ekim":
               System.out.println("10.ay");
               break;
           case "Kasým":
               System.out.println("11.ay");
               break;
           case "Aralýk":
               System.out.println("12.ay");
               break;
	       
	       } 
	}

}
