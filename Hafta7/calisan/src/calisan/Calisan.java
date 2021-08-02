package calisan;

public interface Calisan {
	double saatlikOran = 15.8;
    double ucret();
    void calisanBolumu();
    void ucretBelirleme(double ucretSabiti);
	
	public static void main(String[] args) {
		//iþci
        Ýsci isci = new Ýsci();
        isci.calisanBolumu();
        isci.ucretBelirleme(5000.95);
        System.out.println("Maaþý:" + isci.ucret());

        //müdür
        Mudur mudur = new Mudur();
        mudur.calisanBolumu();
        mudur.ucretBelirleme(2500.8);
        System.out.println("Maaþý:" + mudur.ucret());
        
      //satýþ elemaný
        SatisElemani satisElemani = new SatisElemani();
        satisElemani.calisanBolumu();
        satisElemani.ucretBelirleme(1000.18);
        satisElemani.satisPrimiBelirleme(2500);
        System.out.println("Prim Ücreti:" + satisElemani.prim);
        System.out.println("Maaþý: " + satisElemani.ucret());
       
	}
}
