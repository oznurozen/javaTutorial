package arayuz1;

public interface Arayuz1 {
	public void metod1();
	}
	interface Arayuz2{
	public void metod2();	
	}
	
	class Sinif1 implements Arayuz1{

		@Override
		public void metod1() {
			System.out.println("Aray�z 1 - Metod 1");
			
		}
	}
		class Sinif2 implements Arayuz2{

		@Override
		public void metod2() {
			System.out.println("Aray�z 2 - Metod 2");
	
		}
		
	
	public static void main(String[] args) {
		Sinif1 s1 = new Sinif1();
		s1.metod1();
		
		Sinif2 s2 = new Sinif2();
		s2.metod2();
	}

}
