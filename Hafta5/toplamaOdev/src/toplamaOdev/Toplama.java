package toplamaOdev;

public class Toplama {
	/* Varsayýlan bir toplama iþlemi yaptýrýn ardýndan iki tane yeni sayý giriþi yaparak toplamayý gerçekleþtiriniz.*/
	public int mevcuttoplama = 25+30;
	
	
	Toplama(){
		System.out.println("Mevcut iki sayýnýn toplamý: " + mevcuttoplama);
	}
	
	Toplama(int yeniToplama){
		mevcuttoplama = yeniToplama;
		yeniToplama = mevcuttoplama;
		
		System.out.println("Yeni iki sayýnýn toplamý: " + yeniToplama);
	}
	
	void calistir() {
		System.out.println("Toplam Çalýþtý.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toplama  mevcuttoplama = new Toplama();
		mevcuttoplama.calistir();
		
		Toplama yeniToplama = new Toplama(30+20);
		yeniToplama.calistir();
	}

}
