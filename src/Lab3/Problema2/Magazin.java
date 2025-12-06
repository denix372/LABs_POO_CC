package Lab3.Problema2;

public class Magazin {
    String nume;
    Produs p1, p2, p3;
    public Magazin(String nume, Produs p1, Produs p2, Produs p3) {
        this.nume = nume;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double getTotalMagazin() {
        return p1.getTotalProdus() + p2.getTotalProdus() +
                p3.getTotalProdus();
    }

    @Override
    public String toString() {
        StringBuffer st = new StringBuffer();
        st.append(nume).append("\nProduse:\n");
        st.append(p1).append("\n");
        st.append(p2).append("\n");
        st.append(p3);
        return st.toString();
    }
    
    public static void main(String[] args) {
        Produs p1 = new Produs("Apa", 2.4, 3);
        Produs p2 = new Produs("Paine", 1.3, 4);
        Produs p3 = new Produs("Carne", 5.5, 2);

        Magazin m = new Magazin("Magazin", p1, p2, p3);
        System.out.println(m);
        System.out.println("Total: " + m.getTotalMagazin());
    }

}
