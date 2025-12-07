package Lab6.Problema5;

public class Marfa extends Vagon{

    public Marfa() {
        colete = 400;
    }

    public void deschidereUsi() {
        System.out.println("Usile s-au deschis manual");
    }

    public void inchidereUsi() {
        System.out.println("Usile s-au inchis manual");
    }

    @Override
    public int getColete() {
        return 400;
    }

    @Override
    public String toString() {
        return "Marfa: 400 colete";
    }
}
