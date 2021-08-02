package calisan;

public interface Calisan {
	double saatlikOran = 15.8;
    double ucret();
    void calisanBolumu();
    void ucretBelirleme(double ucretSabiti);
	
	public static void main(String[] args) {
		//i�ci
        �sci isci = new �sci();
        isci.calisanBolumu();
        isci.ucretBelirleme(5000.95);
        System.out.println("Maa��:" + isci.ucret());

        //m�d�r
        Mudur mudur = new Mudur();
        mudur.calisanBolumu();
        mudur.ucretBelirleme(2500.8);
        System.out.println("Maa��:" + mudur.ucret());
        
      //sat�� eleman�
        SatisElemani satisElemani = new SatisElemani();
        satisElemani.calisanBolumu();
        satisElemani.ucretBelirleme(1000.18);
        satisElemani.satisPrimiBelirleme(2500);
        System.out.println("Prim �creti:" + satisElemani.prim);
        System.out.println("Maa��: " + satisElemani.ucret());
       
	}
}
