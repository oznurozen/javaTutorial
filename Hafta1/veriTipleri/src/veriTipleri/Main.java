package veriTipleri;

public class Main {

	public static void main(String[] args) {
		int sayi = 10; //ondalik i�ermeyen say�sal veri tipi tan�mlamas�
        double doubleSayi = 1.80; //ondal�kl� verileri i�eren veri tipi tan�mlamas�
        float floatSayi = (float) 1.90; //ondal�kl� veri tiplerinden bir di�eri olan float tan�mlamas�
        System.out.println(sayi + " " +  doubleSayi + " "+ floatSayi);

        
        String isim = "Java"; //metinsel ifadeler tan�mlamak i�in string veri tipi kullan�l�r.
        char karakter = 'a'; //tek karakter i�eren ifadeler tan�mlamak i�in char
        System.out.println(isim);
        System.out.println(karakter);

        
        //boolean �rne�i
        int a=5; // a de�erine 5 atad�k
        int b=6; // b de�erine 6 atad�k
        boolean x; // boolean tipimizin de�i�ken ad�n� x olarak belirledik.
        x = (a==b); // a ve b ifadelerinin birbirlerine e�it olmas� durumu
        System.out.println(x);
        
        //tipini belirtemedi�imiz veya belirtmek istemedi�imiz ko�ulllarda 'var' ifadesi kullan�l�r.
        var degisken = "Java dersi";
        var sayisalDegisken = 5;
        
        
        //sabit bir fonksiyon tan�mlamak i�in final kelimesini kullan�r�z.
        final int fSayi=5;
        final String fMetin = "Java ile Uygulama Geli�tirme Dersi";
        
        //mod alma
        int mod = 19%5;
        System.out.println(mod);
        
        
         //artt�rma ve azaltma i�lemleri
        int arttirma = 10;
        arttirma ++;
        
        int azaltma = 8;
        azaltma--;
        

	}

}
