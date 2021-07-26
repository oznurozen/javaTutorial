package telefon;

public class Telefon {

	public Telefon() {
		System.out.println("telefon yapýcý metodu - constructor");
	}
	public static void main(String[] args) {
		iphone telefon= new iphone();

	}

}

class AkilliTelefon extends Telefon{
	public AkilliTelefon() {
		System.out.println("Akýllý telefon constructor");
	}
}
class CepTelefonu extends Telefon{
	public CepTelefonu() {
		System.out.println("Cep telefon constructor");
	}
}

class iphone extends CepTelefonu{
	public iphone() {
		System.out.println("iphone constructor-yapýcý metod");
	}
	
	
}

