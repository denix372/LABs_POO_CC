package Lab6.Problema3;

import java.util.Collections;
import java.util.Vector;

public class Test03 {
    public static void main(String[] args) {
        Vector<Student> studenti = new Vector<>();
        studenti.add(new Student("Denis", new Vector<>(java.util.Arrays.asList(9.8, 5.4, 7.6, 6.6))));
        studenti.add(new Student("Maria", new Vector<>(java.util.Arrays.asList(9.9, 9.5))));
        studenti.add(new Student("Alex", new Vector<>(java.util.Arrays.asList(10.0, 9.0))));
        studenti.add(new Student("Maria", new Vector<>(java.util.Arrays.asList(8.0, 9.5))));

        Collections.sort(studenti);
        System.out.println(studenti);

    }
}
