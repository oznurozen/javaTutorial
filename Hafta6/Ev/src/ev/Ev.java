package ev;
//public herkese erižebilir.
//protected az erižilebilir
//private gizli

public class Ev {

	public void kasa() {
		System.out.println("Az Gizli Kasa");
	}
	
	public String dokuman= "Az Gizli belge"; 
	
	public static void main(String[] args) {

		Ev baba = new Ev();
		baba.kasa();
		System.out.println(baba.dokuman);
	}

}
