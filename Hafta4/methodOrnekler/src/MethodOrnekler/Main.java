package MethodOrnekler;

import java.util.Arrays;

public class Main {

	public static void ulkeler() {
		String [] ulke = {"T�rkiye","Almanya","Rusya"};
		System.out.println("�lkeler" + Arrays.toString(ulke) + "�lke Say�s�: "+ ulke.length);
		
		iller();
		ilceler();	
	}
	public static void iller() {
		String [] il = {"�stanbul","Ankara","Denizli"};
		System.out.println("�ller: " + Arrays.toString(il) + "�l Say�s�: " + il.length);
		
	}
	public static void ilceler() {
		String [] ilce = {"a","b","c","d","e"};
		System.out.println("�l�eler: " + Arrays.toString(ilce) + "�l Say�s�: " + ilce.length);
	}

	public static void main(String[] args) {
		ulkeler();

	}

}
