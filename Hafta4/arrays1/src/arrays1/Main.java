package arrays1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		/*Object s�n�f�n� kullanarak 5 elemanl� bir dizi olu�turunuz
		 * ve bu dizi i�erisindeki t�m elemanlar� ekrana yazd�r�n�z.*/
		Object dizi6 [] = new Object[5]; // 5 elemanl� bir dizi olu�turduk. 
		dizi6[0] = "Mehmet";
		dizi6[1] = 2;
		dizi6[2] = 5.9;
		dizi6[3] = "�znur";
		dizi6[4] = 'K';
		
		for(int i=0; i<dizi6.length; i++) {
			System.out.println(dizi6[i]);
			}
		System.out.println("--------------------");
		
		//dizilerde s�ralama i�lemleri
        int [] siralama = {1,8,5,2};
        Arrays.sort(siralama);
        for(int i=0; i<siralama.length; i++) {
        	System.out.println(siralama[i]);
        }
		System.out.println("--------------------");
		
        String strDizi[] = {"Edirne"," Afyon", "Adapazar�", "Be�ikta�"};
        System.out.println("String Dizi: " + Arrays.toString(strDizi));
        Arrays.sort(strDizi);
        System.out.println("S�ral� Dizi:"  + Arrays.toString(strDizi));
        
        System.out.println("----------");
        //2 dizi olu�turun ve her birinin i�erisine tek karakter atay�n ard�ndan e�itlik 
        //kontrol�n� sa�layarak ��kt� veriniz.
        String metin[] = {"A"};
        String metin2[] = {"A"};
        if(Arrays.equals(metin, metin2)) {
        	System.out.println("E�it");
        }
        else {
        	System.out.println("E�it de�ildir.");
        }
        
        System.out.println("----------");
        //2 dizi olu�turun ve ard�ndan her biri i�erisine 2 adet say�sal de�er atayarak 
        //kar��la�t�rma i�lemini ger�ekle�tiriniz.
        int sayi[] = {5,7};
        int sayi2[] = {8,6};
        if(Arrays.equals(sayi, sayi2)) {
        	System.out.println("E�it");
        }
        else {
        	System.out.println("E�it de�ildir.");
        }
	}

}
