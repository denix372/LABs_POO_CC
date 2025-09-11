package Lab6.Problema5;

public class CalatoriA extends Vagon{
    public CalatoriA() {
        super(40,300);
    }

    @Override
    public void deschideUsi() {
        System.out.println("CalatoriA: Usile se deschid automat.");
    }

    @Override
    public void inchideUsi() {
        System.out.println("CalatoriA: Usile se inchid automat.");
    }
}
