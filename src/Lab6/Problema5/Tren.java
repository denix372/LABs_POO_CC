package Lab6.Problema5;

import java.util.Vector;

public class Tren implements Comparable<Tren> {
    private final Vector<Vagon> vagoane = new Vector<>();

    public void addVagon(Vagon v) {
        vagoane.add(v);
    }

    public Vector<Vagon> getVagoane() {
        return vagoane;
    }

    public int getCapacitateTotalaColete() {
        int total = 0;
        for(Vagon v: vagoane)
            total += v.getCapacitateColete();
        return total;
    }

    public void afiseazaTipuriVagoane() {
        System.out.println("Tipuri de vagoane in tren:");
        for(Vagon v : vagoane)
            System.out.println(" - " + v);
    }

    @Override
    public int compareTo(Tren o) {
        return Integer.compare(this.getCapacitateTotalaColete(), o.getCapacitateTotalaColete());
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Tren other))
            return false;

        return this.getCapacitateTotalaColete() == other.getCapacitateTotalaColete();
    }

    @Override
    public String toString() {
        afiseazaTipuriVagoane();
        return "Capacitate totală colete: " + getCapacitateTotalaColete();
    }
}
