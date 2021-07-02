package binarySearch;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		        // TODO code application logic here
		        int arama [] = {1,40,8,72,50,90};
		        Arrays.sort(arama);
		        int deger = Arrays.binarySearch(arama,40);
		        System.out.println(deger);
		        
		       

	}

}
