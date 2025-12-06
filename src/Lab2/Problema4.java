package Lab2;
import java.util.Collections;
import java.util.Vector;

public class Problema4 {
    public Vector<Integer> reunion(Vector<Integer> v1, Vector<Integer>v2) {
        Vector<Integer> re = new Vector<>(v1);
        for(int x : v2)
            if(!v1.contains(x))
                re.add(x);
        Collections.sort(re);
        return re;
    }

    public Vector<Integer> intersection(Vector<Integer> v1, Vector<Integer>v2) {
        Vector<Integer> in = new Vector<>();
        for(int x : v1)
            if(v2.contains(x))
                in.add(x);
        return in;
    }

    public Vector<Integer> difference(Vector<Integer> v1, Vector<Integer>v2) {
        Vector<Integer> dif = new Vector<>();
        for(int x : v1)
            if(!v2.contains(x))
                dif.add(x);
        return dif;
    }

    public static void main(String[] args) {
        Problema4 pb = new Problema4();
        Vector<Integer> v1 = new Vector<>();
        Vector<Integer> v2 = new Vector<>();

        for (int i = 0; i < 10; i++) {
            v1.add(20 - i);
            v2.add(i);
            if( i <=5)
                v1.add(i);
        }
        Collections.sort(v1);
        Collections.sort(v2);

        System.out.println("vector1: " + v1);
        System.out.println("vector2: " + v2);
        System.out.println("Reuniunea: " + pb.reunion(v1,v2));
        System.out.println("Intersection: " + pb.intersection(v1,v2));
        System.out.println("Differente between vector1 and vector2: " + pb.difference(v1, v2));
        System.out.println("Differente between vector2 and vector1: " + pb.difference(v2, v1));
    }
}
