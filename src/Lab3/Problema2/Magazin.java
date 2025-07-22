package Lab3.Problema2;

public class Magazin {
    String nume;
    Produs[] produse = new Produs[3];

    public Magazin(String nume, Produs[] produse) {
        this.nume = nume;
        this.produse = produse;
    }

    @Override
    public String toString() {
        String rezultat = "Magazin: " + nume + "\nProduse:\n";
        for (int i = 0; i < produse.length; i++) {
            rezultat += produse[i].toString() + "\n";
        }
        return rezultat;
    }

    public double getTotalMagazin(){
        return produse[0].getTotalProdus() + produse[1].getTotalProdus() + produse[2].getTotalProdus();
    }
}
