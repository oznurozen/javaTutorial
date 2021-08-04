package odev;
/*Hayvan adýnda ana class ýnýz olsun ve bu sýnýfta 
 * özellik olarak hayvanýn ismi, çýkardýðý ses ve türü
 *  bulunsun. Bunlarý güvenlik en üst seviyede olacak 
 *  þekilde kalýtým kullnarak oluþturunuz. Bu ana classýn
 *   2 adet de miras alan sýnýfý olsun köpek ve kedi 
 *   adýnda. Ana class daki bilgileri override ederek 
 *   her sýnýfa özel olarak yeniden tanýmlayýnýz. 
 *   Sonrasýnda bu bilgileri çýktý olarak veriniz.*/

public class Main {
	public static void canliTanimla(Hayvan canli) {
		canli.isim();
		canli.ses();
		canli.tur();
	}

	public static void main(String[] args) {
		Hayvan hayvan = new Hayvan();
		Kopek kopek = new Kopek();
		Kedi kedi = new Kedi();
		
		canliTanimla(hayvan);
		canliTanimla(kedi);
		canliTanimla(kopek);

	}

}
