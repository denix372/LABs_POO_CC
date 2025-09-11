package Lab6.Problema5;

public class Marfa extends Vagon {
    public Marfa() {
        super(0, 400);
    }

    @Override
    public void deschideUsi() {
        System.out.println("Marfa: Usile se deschid manual.");
    }

    @Override
    public void inchideUsi() {
        System.out.println("Marfa: Usile se inchid manual.");
    }
}
