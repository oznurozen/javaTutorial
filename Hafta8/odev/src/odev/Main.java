package odev;
/*Hayvan ad�nda ana class �n�z olsun ve bu s�n�fta 
 * �zellik olarak hayvan�n ismi, ��kard��� ses ve t�r�
 *  bulunsun. Bunlar� g�venlik en �st seviyede olacak 
 *  �ekilde kal�t�m kullnarak olu�turunuz. Bu ana class�n
 *   2 adet de miras alan s�n�f� olsun k�pek ve kedi 
 *   ad�nda. Ana class daki bilgileri override ederek 
 *   her s�n�fa �zel olarak yeniden tan�mlay�n�z. 
 *   Sonras�nda bu bilgileri ��kt� olarak veriniz.*/

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
