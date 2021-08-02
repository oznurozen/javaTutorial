package soyutSinif;

abstract class SoyutSinif {
	
	abstract public void abstractMethod(); //soyut method olu�turduk.
	
	public SoyutSinif() { // CONSTRUCTOR
		System.out.println("Soyut s�n�f yap�c�s�");
	}
	
	public void method() {
		System.out.println("Normal method.");
	}
	
	public static void staticMethod() {
		System.out.println("Static method.");
	}

}
	class AltSinif extends SoyutSinif{
		@Override
		public void abstractMethod() {
			System.out.println("Alt s�n�f.");
		}
	}
	
	class AltSinif2 extends SoyutSinif{
		@Override
		public void abstractMethod() {
			System.out.println("Alt s�n�f2.");
		}
	}
	
	public class Baslat{
	public static void main(String[] args) {
		 AltSinif a1 = new AltSinif();
	        AltSinif2 a2 = new AltSinif2();
	        
	        a1.abstractMethod();
	        a2.abstractMethod();
	        
	        SoyutSinif soyutSinif[] = new SoyutSinif[1];
	        soyutSinif[0] = a1;
	        soyutSinif[0].method();
	        SoyutSinif.staticMethod();

	}

}
