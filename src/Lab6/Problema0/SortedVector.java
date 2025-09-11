package Lab6.Problema0;

import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.Vector;

public class SortedVector extends Vector {
    Comparator c;

    public SortedVector(Comparator c) {
        this.c = c;
    }

    public SortedVector(){
        this(null);
    }

    public boolean add(Objects o){
        super.add(o);
        Collections.sort(this, c);
        return true;
    }
}
