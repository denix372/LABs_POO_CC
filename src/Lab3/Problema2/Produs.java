package Lab3.Problema2;

public class Produs {
    String nume;
    float pret;
    int cantitate;

    public Produs(String nume, float pret, int cantitate) {
        this.nume = nume;
        this.pret = pret;
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        return "\"Produs " + nume  + " " + pret +  " " + cantitate + "\"";
    }

    public double getTotalProdus() {
        return pret * cantitate;
    }
}
