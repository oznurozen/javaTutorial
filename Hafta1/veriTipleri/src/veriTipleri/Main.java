package veriTipleri;

public class Main {

	public static void main(String[] args) {
		int sayi = 10; //ondalik içermeyen sayýsal veri tipi tanýmlamasý
        double doubleSayi = 1.80; //ondalýklý verileri içeren veri tipi tanýmlamasý
        float floatSayi = (float) 1.90; //ondalýklý veri tiplerinden bir diðeri olan float tanýmlamasý
        System.out.println(sayi + " " +  doubleSayi + " "+ floatSayi);

        
        String isim = "Java"; //metinsel ifadeler tanýmlamak için string veri tipi kullanýlýr.
        char karakter = 'a'; //tek karakter içeren ifadeler tanýmlamak için char
        System.out.println(isim);
        System.out.println(karakter);

        
        //boolean örneði
        int a=5; // a deðerine 5 atadýk
        int b=6; // b deðerine 6 atadýk
        boolean x; // boolean tipimizin deðiþken adýný x olarak belirledik.
        x = (a==b); // a ve b ifadelerinin birbirlerine eþit olmasý durumu
        System.out.println(x);
        
        //tipini belirtemediðimiz veya belirtmek istemediðimiz koþulllarda 'var' ifadesi kullanýlýr.
        var degisken = "Java dersi";
        var sayisalDegisken = 5;
        
        
        //sabit bir fonksiyon tanýmlamak için final kelimesini kullanýrýz.
        final int fSayi=5;
        final String fMetin = "Java ile Uygulama Geliþtirme Dersi";
        
        //mod alma
        int mod = 19%5;
        System.out.println(mod);
        
        
         //arttýrma ve azaltma iþlemleri
        int arttirma = 10;
        arttirma ++;
        
        int azaltma = 8;
        azaltma--;
        

	}

}
