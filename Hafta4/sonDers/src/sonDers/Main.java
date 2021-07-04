package sonDers;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int [] sayi1 = {1,5,8,9};
		System.out.println(Arrays.toString(sayi1));
		System.out.println("--------------");
		// int türünde çok boyutlu bir dizi oluþturun ve tüm elemanlarý çýktý olarak veriniz.
		int [][] dizi = {{2,3},{4,5},{6,7}};
		for(int i=0; i<3; i++) {
			System.out.println("");
			for(int j=0; j<2; j++) {
				System.out.print(dizi[i][j] + " ");
			}
		}
		System.out.println("--------------");
		//String türünde çok boyutlu bir dizi oluþturun (3*3 matrisli) ve tüm elemanlarý çýktý olarak veriniz. Abc def ghý þeklinde ilerlesin.
		String [][] dizi1 = {{"a","b","c"},{"d","e","f"},{"g","h","ý"}};
		for(int i=0; i<3; i++) {
			System.out.println("");
			for(int j=0; j<3; j++) {
				System.out.print(dizi1[i][j] + " ");
			}
		}
		//Bir önceki soruda bulunan e ifadesini ekrana yazdýrýn.
		System.out.println();
		System.out.println(dizi1[1][1]);
		
		
	}

}
