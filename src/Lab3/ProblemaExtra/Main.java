package Lab3.ProblemaExtra;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produs p1 = new Produs("Apa", 1.3, TipProdus.ALIMENTAR);
        Produs p2 = new Produs("Cuptor", 200.43, TipProdus.ELECTRONIC);
        Produs p3 = new Produs("Tricou", 99.99, TipProdus.VESTIMENTAR);
        Produs p4 = new Produs("Geaca", 500.99, TipProdus.VESTIMENTAR);
        Produs p5 = new Produs("Pix", 1.99, TipProdus.ALTUL);

        ArrayList<Produs> arr = new ArrayList<>();
        arr.add(p1);
        arr.add(p2);
        arr.add(p3);
        arr.add(p4);
        arr.add(p5);

        for(Produs p : arr) {
            if(p.tip() == TipProdus.VESTIMENTAR)
                System.out.println(p);
        }
    }
}
