package calisan;

public class Mudur implements Calisan {

	double ucretSabiti;
	@Override
	public double ucret() {
		return ucretSabiti;
	}

	@Override
	public void calisanBolumu() {
		System.out.println("�r�n M�d�r�");
		
	}

	@Override
	public void ucretBelirleme(double ucretSabiti) {
		this.ucretSabiti = ucretSabiti;
		
	}

}
