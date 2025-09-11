package Lab6.Problema5;

public class CalatoriB extends Vagon {
    public CalatoriB(){
        super(50,400);
    }

    @Override
    public void deschideUsi() {
        System.out.println("CalatoriB: Usile se deschi automat.");
    }

    @Override
    public void inchideUsi() {
        System.out.println("CalatoriB: Usile se inchid automat.");
    }

    @Override
    public void blocheazaGeamuri() {
        System.out.println("CalatoriB: Geamurile au fost blocate automat.");
    }
}
