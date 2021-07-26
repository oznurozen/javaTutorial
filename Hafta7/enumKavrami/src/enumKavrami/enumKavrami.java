package enumKavrami;

enum araba{
	AUDÝ("Siyah"), BMW("Kýrmýzý"), FIAT("Beyaz");
	public String renk;
	araba(String renk){
		this.renk = renk;
	}
}

public class enumKavrami {

	public static void main(String[] args) {
		
		for(araba a:araba.values()) {
			System.out.println(a.renk);
		}
		
	}

}
