package calisan;

public class �sci implements Calisan{
	double ucretSabiti;
    @Override
    public void calisanBolumu() {
        
        System.out.println("�nsan Kaynaklar�");
         }

    @Override
    public double ucret() {
        return ucretSabiti*saatlikOran;
    }

    @Override
    public void ucretBelirleme(double ucretSabiti) {
        this.ucretSabiti = ucretSabiti;
         }
	

}
