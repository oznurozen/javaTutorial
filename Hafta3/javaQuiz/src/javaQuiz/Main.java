package javaQuiz;

public class Main {

	public static void main(String[] args) {
		int deger1 =15;
		int deger2 =20;
		int topla = (deger1+deger2);
        System.out.println("Toplam: " + topla);
        System.out.println("--------------"); 
        int a = 4;
    	switch(a){
        case 0:
       		System.out.println("sýfýr");
       		break;
        case 1:
       		System.out.println("bir");
       		break;
        case 2:
       		System.out.println("iki");
       		break;
        case 3:
       		System.out.println("üç");
       		break;
        case 4:
       		System.out.println("dört");
       		break;
    	}
    	 System.out.println("--------------"); 
    	
    	for(int sayi=100; sayi>=1; sayi--) {
			System.out.print(sayi + " ");
		}
    	 System.out.println("--------------"); 
      int sayi = 0;	
		do {
			sayi++;
		}
		while(sayi<=10);
		System.out.println(sayi + " ");
		
	}
	
}
