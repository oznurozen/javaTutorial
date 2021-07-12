package toplamaOdev;

public class Toplama {
	/* Varsay�lan bir toplama i�lemi yapt�r�n ard�ndan iki tane yeni say� giri�i yaparak toplamay� ger�ekle�tiriniz.*/
	public int mevcuttoplama = 25+30;
	
	
	Toplama(){
		System.out.println("Mevcut iki say�n�n toplam�: " + mevcuttoplama);
	}
	
	Toplama(int yeniToplama){
		mevcuttoplama = yeniToplama;
		yeniToplama = mevcuttoplama;
		
		System.out.println("Yeni iki say�n�n toplam�: " + yeniToplama);
	}
	
	void calistir() {
		System.out.println("Toplam �al��t�.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toplama  mevcuttoplama = new Toplama();
		mevcuttoplama.calistir();
		
		Toplama yeniToplama = new Toplama(30+20);
		yeniToplama.calistir();
	}

}
