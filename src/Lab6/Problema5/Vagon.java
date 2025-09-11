package Lab6.Problema5;

public abstract class Vagon {
    int capacitateColete;
    int capacitatePasageri;

    public Vagon(int capacitatePasageri, int capacitateColete) {
        this.capacitateColete = capacitateColete;
        this.capacitatePasageri = capacitatePasageri;
    }

    public int getCapacitateColete() {
        return capacitateColete;
    }

    public int getCapacitatePasageri() {
        return capacitatePasageri;
    }
    public abstract void deschideUsi();
    public abstract void inchideUsi();

    public void blocheazaGeamuri() {
        System.out.println("Acest vagon nu are geamuri blocabible.");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [pasageri="
                + capacitatePasageri + ", colete=" + capacitateColete + "]";
    }
}
