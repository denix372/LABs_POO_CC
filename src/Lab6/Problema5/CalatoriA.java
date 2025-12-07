package Lab6.Problema5;

public class CalatoriA extends Vagon{
    int pasageri;

    public CalatoriA() {
        pasageri = 40;
        colete = 300;
        deschidereUsi();
        inchidereUsi();
    }

    public void deschidereUsi() {
        System.out.println("Usile s-au deschis automat");
    }

    public void inchidereUsi() {
        System.out.println("Usile s-au inschis automat");
    }

    @Override
    public int getColete() {
        return 300;
    }

    @Override
    public String toString() {
        return "CalatoriA: 300 colete";
    }


}
