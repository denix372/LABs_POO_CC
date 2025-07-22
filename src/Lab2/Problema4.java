package Lab2;

import java.util.Vector;

public class Problema4 {

    Vector<Integer> Reuniune(Vector<Integer> v1, Vector<Integer> v2) {
        Vector<Integer> v_reunited= (Vector<Integer>) v1.clone();
        for(int i = 0; i < v2.size(); i++) {
            boolean ok = v_reunited.contains(  v2.get(i) ) ;
            if(ok == false ) {
                v_reunited.add( v2.get(i));
            }
        }
        return v_reunited;
    }

    Vector<Integer> Intersectie(Vector<Integer> v1, Vector<Integer> v2) {
        Vector<Integer> v_intersect = new Vector<>( );

        int k = 0;
        for(int i=0; i < v1.size(); i++) {
            for(int j=0; j < v2.size(); j++) {
                if( v1.get(i).equals( v2.get(j))) {
                    v_intersect.add(v1.get(i));

                }
            }
        }

        return v_intersect;
    }

    Vector<Integer> Diferenta(Vector<Integer> v1, Vector<Integer> v2) {
        Vector<Integer> v_diff = new Vector<>( );

        int k = 0;
        for(int i=0; i < v1.size(); i++) {
            if( v2.contains( v1.get(i)) == false ) {
                    v_diff.add(v1.get(i));
            }
        }

        return v_diff;
    }

    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>(10);
        Vector<Integer> v2 = new Vector<>(10);
        v1.setSize(10);
        v2.setSize(10);

        for(int i=0; i< v1.size(); i++) {
            v1.setElementAt( i, i);
        }

        for(int i=0; i< v2.size(); i++) {
            v2.setElementAt( 15 - i, i);
        }

        System.out.println(v1);
        System.out.println(v2);

        Problema4 p = new Problema4();
        Vector<Integer> reunited = p.Reuniune(v1, v2);
        System.out.println(reunited);

        Vector<Integer> intersect = p.Intersectie(v1,v2);
        System.out.println(intersect);

        Vector<Integer> diff1 = p.Diferenta(v1,v2);
        System.out.println(diff1);

        Vector<Integer> diff2 = p.Diferenta(v2,v1);
        System.out.println(diff2);

    }
}
