package telefon;

public class Telefon {

	public Telefon() {
		System.out.println("telefon yap�c� metodu - constructor");
	}
	public static void main(String[] args) {
		iphone telefon= new iphone();

	}

}

class AkilliTelefon extends Telefon{
	public AkilliTelefon() {
		System.out.println("Ak�ll� telefon constructor");
	}
}
class CepTelefonu extends Telefon{
	public CepTelefonu() {
		System.out.println("Cep telefon constructor");
	}
}

class iphone extends CepTelefonu{
	public iphone() {
		System.out.println("iphone constructor-yap�c� metod");
	}
	
	
}

