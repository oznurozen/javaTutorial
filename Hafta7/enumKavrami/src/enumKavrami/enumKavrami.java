package enumKavrami;

enum araba{
	AUD�("Siyah"), BMW("K�rm�z�"), FIAT("Beyaz");
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
