package Lab3.Problema2;

public class Main {
    public static void main(String[] args) {
        Magazin m = new Magazin("MegaImage", new Produs[]{
                new Produs("Lapte", 5.5f, 2),
                new Produs("Paine", 2.0f, 3),
                new Produs("Oua", 0.6f, 10)
        });

        System.out.println(m);
        System.out.println("Total: " + m.getTotalMagazin());
    }
}


