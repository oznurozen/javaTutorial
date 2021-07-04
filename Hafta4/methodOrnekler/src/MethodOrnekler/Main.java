package MethodOrnekler;

import java.util.Arrays;

public class Main {

	public static void ulkeler() {
		String [] ulke = {"Türkiye","Almanya","Rusya"};
		System.out.println("Ülkeler" + Arrays.toString(ulke) + "Ülke Sayýsý: "+ ulke.length);
		
		iller();
		ilceler();	
	}
	public static void iller() {
		String [] il = {"Ýstanbul","Ankara","Denizli"};
		System.out.println("Ýller: " + Arrays.toString(il) + "Ýl Sayýsý: " + il.length);
		
	}
	public static void ilceler() {
		String [] ilce = {"a","b","c","d","e"};
		System.out.println("Ýlçeler: " + Arrays.toString(ilce) + "Ýl Sayýsý: " + ilce.length);
	}

	public static void main(String[] args) {
		ulkeler();

	}

}
