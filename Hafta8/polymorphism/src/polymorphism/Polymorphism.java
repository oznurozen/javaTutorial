package polymorphism;

class UstSinif{
	public void yaz() {
		System.out.println("Ust Sinif");
	}
}

class AltSinif1 extends UstSinif{
	@Override
	public void yaz() {
		System.out.println("Alt Sinif1");
	}
}

class AltSinif2 extends UstSinif{
	@Override
	public void yaz() {
		System.out.println("Alt Sinif2");
	}
}

public class Polymorphism {
	public static void nesneOlustur(UstSinif nesne) {
		nesne.yaz();
	}

	public static void main(String[] args) {
		UstSinif u1 = new UstSinif();
		AltSinif1 a1 = new AltSinif1();
		AltSinif2 a2 = new AltSinif2();
		
		nesneOlustur(u1);
		nesneOlustur(a1);
		nesneOlustur(a2);


	}

}
