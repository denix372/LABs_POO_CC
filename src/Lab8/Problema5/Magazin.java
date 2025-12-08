package Lab8.Problema5;

import java.util.HashMap;
import java.util.Map;

public class Magazin {
    HashMap<String, Produs> m = new HashMap<>();

    class Produs {
        String nume;
        double vechi, nou;
        int stoc;
        boolean redus;

        public Produs(String nume, double vechi, int stoc, boolean redus) {
            if (nume == null)
                throw new IllegalArgumentException("Nume invalid");
            if (vechi < 0)
                throw new IllegalArgumentException("Pret invalid");
            if(stoc < 0)
                throw new IllegalArgumentException("Stoc invalid");

            this.nume = nume;
            this.vechi = vechi;
            this.nou = vechi;
            this.stoc = stoc;
            this.redus = redus;
        }

        @Override
        public String toString() {
            return String.format("Produs: %s | Pret vechi: %.2f | Pret nou: %.2f | Stoc: %d | Redus: %b",
                    nume, vechi, nou, stoc, redus);
        }
    }

    public void adaugaProdus(String cod, String nume, double pret, int stoc) {
        m.put(cod, new Produs(nume, pret, stoc, false));
    }

    public void aplicaReduceriStocMic() {
        for( Map.Entry<String, Produs> entry : m.entrySet()) {
            Produs p = entry.getValue();
            if (p.stoc < 50 && !p.redus) {
                p.nou = Math.round(p.vechi * 0.85 * 100.0) / 100.0;
                p.redus = true;
            }
        }
    }

    public void afiseazaInventar() {
        for( Map.Entry<String, Produs> entry : m.entrySet())
            System.out.println(entry.getValue());
    }

    public static void main(String[] args) {
        Magazin magazin = new Magazin();

        magazin.adaugaProdus("P001", "Laptop", 3500.0, 20);
        magazin.adaugaProdus("P002", "Telefon", 2500.0, 100);
        magazin.adaugaProdus("P003", "Casti", 300.0, 40);

        System.out.println("Inventar initial:");
        magazin.afiseazaInventar();

        magazin.aplicaReduceriStocMic();

        System.out.println("\nInventar dupa aplicarea reducerilor:");
        magazin.afiseazaInventar();
    }

}
