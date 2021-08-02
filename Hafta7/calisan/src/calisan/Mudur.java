package calisan;

public class Mudur implements Calisan {

	double ucretSabiti;
	@Override
	public double ucret() {
		return ucretSabiti;
	}

	@Override
	public void calisanBolumu() {
		System.out.println("Ürün Müdürü");
		
	}

	@Override
	public void ucretBelirleme(double ucretSabiti) {
		this.ucretSabiti = ucretSabiti;
		
	}

}
