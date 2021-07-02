package cokBoyutluDiziler;

public class Main {

	public static void main(String[] args) {
		 //String çok boyutlu dizi tanýmlamalarý
        String [][] metin = {{"Nisa","Mehmet"}, {"Ali", "Ayþe"}, {"Programlama", "Java"}};
        String[][] a = new String[10][5]; 
        a[0][0] = "Nisa";
        a[0][1] = "Ahmet";
        // TODO code application logic here
        //1 satýrýn 1 indeksli elemanýný ekrana yazdýrýnýz.
         int dizi[][] = {{1,33}, {5,88}};
         System.out.println(dizi[1][1]);

	}

}
