package Lab6.Problema5;

public class CalatoriB extends Vagon{
    int pasageri;

    public CalatoriB() {
        pasageri = 50;
        colete = 400;
        deschidereUsi();
        inchidereUsi();
        blocareGeamuri();
    }

    public void deschidereUsi() {
        System.out.println("Usile s-au deschis automat");
    }

    public void inchidereUsi() {
        System.out.println("Usile s-au inschis automat");
    }

    public void blocareGeamuri() {
        System.out.println("Geamurile s-au blocat");
    }

    @Override
    public int getColete() {
        return 400;
    }

    @Override
    public String toString() {
        return "CalatoriB: 400 colete";
    }
}
