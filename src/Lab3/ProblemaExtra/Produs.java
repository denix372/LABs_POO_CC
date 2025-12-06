package Lab3.ProblemaExtra;

public record Produs(String nume, double pret, TipProdus tip) {
    public void descriere() {
        System.out.println("Nume=" + nume + ", Tip=" + tip + ", Pret=" + pret);
    }
}
