package Lab2;

import java.util.Random;
import java.util.Vector;

public class Problema3 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(10);
        v.setSize(10);


        for(int i=0; i< v.size(); i++) {
            Random generator= new Random();
            v.setElementAt( generator.nextInt(10), i);

        }
        System.out.println(v);
    }
}
