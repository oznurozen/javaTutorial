package arrays1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		/*Object sýnýfýný kullanarak 5 elemanlý bir dizi oluþturunuz
		 * ve bu dizi içerisindeki tüm elemanlarý ekrana yazdýrýnýz.*/
		Object dizi6 [] = new Object[5]; // 5 elemanlý bir dizi oluþturduk. 
		dizi6[0] = "Mehmet";
		dizi6[1] = 2;
		dizi6[2] = 5.9;
		dizi6[3] = "Öznur";
		dizi6[4] = 'K';
		
		for(int i=0; i<dizi6.length; i++) {
			System.out.println(dizi6[i]);
			}
		System.out.println("--------------------");
		
		//dizilerde sýralama iþlemleri
        int [] siralama = {1,8,5,2};
        Arrays.sort(siralama);
        for(int i=0; i<siralama.length; i++) {
        	System.out.println(siralama[i]);
        }
		System.out.println("--------------------");
		
        String strDizi[] = {"Edirne"," Afyon", "Adapazarý", "Beþiktaþ"};
        System.out.println("String Dizi: " + Arrays.toString(strDizi));
        Arrays.sort(strDizi);
        System.out.println("Sýralý Dizi:"  + Arrays.toString(strDizi));
        
        System.out.println("----------");
        //2 dizi oluþturun ve her birinin içerisine tek karakter atayýn ardýndan eþitlik 
        //kontrolünü saðlayarak çýktý veriniz.
        String metin[] = {"A"};
        String metin2[] = {"A"};
        if(Arrays.equals(metin, metin2)) {
        	System.out.println("Eþit");
        }
        else {
        	System.out.println("Eþit deðildir.");
        }
        
        System.out.println("----------");
        //2 dizi oluþturun ve ardýndan her biri içerisine 2 adet sayýsal deðer atayarak 
        //karþýlaþtýrma iþlemini gerçekleþtiriniz.
        int sayi[] = {5,7};
        int sayi2[] = {8,6};
        if(Arrays.equals(sayi, sayi2)) {
        	System.out.println("Eþit");
        }
        else {
        	System.out.println("Eþit deðildir.");
        }
	}

}
