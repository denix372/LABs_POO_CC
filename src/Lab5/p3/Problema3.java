package p3;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

// Definim excepția personalizată
class NumarNegativ extends Exception {
    public NumarNegativ() {
        super("Numarul introdus este negativ!");
    }
}

public class Problema3 {
    // Vector pentru stocarea numerelor pozitive
    private Vector<Integer> numere = new Vector<>();

    // Metoda de citire
    public void myRead() throws NumarNegativ {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numere intregi (negativ pentru oprire):");

        while (true) {
            int x = sc.nextInt();
            if (x < 0) {
                throw new NumarNegativ(); // aruncăm excepția
            }
            numere.add(x);
        }
    }

    // Metodă pentru determinarea maximului
    public int getMax() {
        return Collections.max(numere);
    }

    public static void main(String[] args) {
        Problema3 p = new Problema3();

        try {
            p.myRead();
        } catch (NumarNegativ e) {
            System.out.println(e.getMessage());
            if (!p.numere.isEmpty()) {
                System.out.println("Elementul maxim din sir este: " + p.getMax());
            } else {
                System.out.println("Nu au fost introduse numere pozitive.");
            }
        }
    }
}
