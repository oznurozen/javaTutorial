package soyutSinif;

abstract class SoyutSinif {
	
	abstract public void abstractMethod(); //soyut method oluþturduk.
	
	public SoyutSinif() { // CONSTRUCTOR
		System.out.println("Soyut sýnýf yapýcýsý");
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
			System.out.println("Alt sýnýf.");
		}
	}
	
	class AltSinif2 extends SoyutSinif{
		@Override
		public void abstractMethod() {
			System.out.println("Alt sýnýf2.");
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
