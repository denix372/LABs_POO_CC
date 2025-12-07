package Lab6.Problema3;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        Vector<Student> v = new Vector<>();
        Student s1 = new Student("Alex");
        Student s2 = new Student("Andrei");
        Student s3 = new Student("Andrei");

        s1.addMedie(5.3);
        s1.addMedie(7.3);
        s1.addMedie(9.3);
        s1.addMedie(6.7);

        s2.addMedie(10.0);
        s2.addMedie(5.4);
        s2.addMedie(8.8);
        s2.addMedie(9.9);

        s3.addMedie(5.3);
        s3.addMedie(7.3);
        s3.addMedie(9.3);
        s3.addMedie(6.7);

        v.add(s1);
        v.add(s2);
        v.add(s3);

        Collections.sort(v);
        for (Student st : v)
            System.out.println(st.getNume() + " -> medie: " + st.calculMedieGenerala());

    }
}
