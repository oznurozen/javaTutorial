package calisan;

public class SatisElemani implements Calisan {

	double ucretSabiti;
	double prim;
	double primOrani = 80.5;
	
	@Override
	public double ucret() {
		return (ucretSabiti*saatlikOran) + prim;
	}

	@Override
	public void calisanBolumu() {
		System.out.println("Satýþ Elemaný");
		
	}

	@Override
	public void ucretBelirleme(double ucretSabiti) {
		this.ucretSabiti = ucretSabiti;
		
	}
	
	public void satisPrimiBelirleme(int adet){
        prim = adet*primOrani;
    }

}
