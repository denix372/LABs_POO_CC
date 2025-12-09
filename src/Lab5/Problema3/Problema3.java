package Lab5.Problema3;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Problema3 {
    Vector<Integer> v = new Vector<>();

    public void myRead() throws NumarNegativ {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        while(x > -1) {
            v.add(x);
            x = sc.nextInt();
        }

        throw new NumarNegativ("Numarul introdus e negativ!");
    }

    public static void main(String[] args) {
        Problema3 pb = new Problema3();
        try {
            pb.myRead();
        } catch (NumarNegativ e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(pb.v);

            if (!pb.v.isEmpty()) {
                int maxim = Collections.max(pb.v);
                System.out.println("Maximul este: " + maxim);
            } else {
                System.out.println("Vectorul este gol, nu exista maxim");
            }
        }
    }
}
