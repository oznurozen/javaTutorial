package getterSetter;
//get okumaya yarar.

public class GetterSetter {

	private int yas;
	private String ad;
	
	public int getyas() {
		return yas;
	}

	public void setyas(int yas) {
		this.yas = yas;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public static void main(String[] args) {
		GetterSetter kisi = new GetterSetter();
		kisi.setAd("Öznur");
		System.out.println(kisi.getAd());
		
		kisi.setyas(22);
		System.out.println(kisi.getyas());
		

	}

}
