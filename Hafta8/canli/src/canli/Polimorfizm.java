package canli;

class Canli {
	public void metod() {
		System.out.println("Canlý Sýnýf");
	}
}

class Insan extends Canli {
	@Override
	public void metod() {
		System.out.println("Ýnsan Sýnýf");
	}
}

class Hayvan extends Canli {
	@Override
	public void metod() {
		System.out.println("Hayvan Sýnýf");
	}
}

class Bitki extends Canli {
	@Override
	public void metod() {
		System.out.println("Bitki Sýnýf");
	}
}

public class Polimorfizm {
	public static void nesneAl(Canli canlilar) {
		if(canlilar instanceof Canli) {
			Canli canli = canlilar;
			canli.metod();
		}
		else if(canlilar instanceof Insan) {
			Insan insan =(Insan) canlilar;
			insan.metod();
		}
		else if(canlilar instanceof Hayvan) {
			Hayvan hayvan = (Hayvan) canlilar;
			hayvan.metod();
		}
		else if(canlilar instanceof Bitki) {
			Bitki bitki = (Bitki) canlilar;
			bitki.metod();
		}
	}
	public static void main(String[] args) {
		Canli canli = new Canli();
		Insan insan = new Insan();
		Hayvan hayvan = new Hayvan();
		Bitki bitki = new Bitki();
		
		Polimorfizm.nesneAl(canli);
		Polimorfizm.nesneAl(insan);
		Polimorfizm.nesneAl(hayvan);
		Polimorfizm.nesneAl(bitki);

	}

}
