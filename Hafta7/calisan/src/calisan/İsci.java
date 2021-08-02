package calisan;

public class Ýsci implements Calisan{
	double ucretSabiti;
    @Override
    public void calisanBolumu() {
        
        System.out.println("Ýnsan Kaynaklarý");
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
