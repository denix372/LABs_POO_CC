package Lab6.Problema5;

import java.util.Collections;
import java.util.Vector;

public class Tren {
    Vector<Vagon> vagoane;

    public Tren() {
        vagoane = new Vector<>();
    }

    public void addVagon(Vagon v) {
        vagoane.add(v);
        Collections.sort(vagoane);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Vagon v : vagoane)
           sb.append(v).append('\n');
        return sb.toString();
    }

}
