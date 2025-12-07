package Lab6.Problema0;

import java.util.*;
public class SortedVector extends Vector{
    Comparator c;
    public SortedVector(Comparator c){
        this.c=c;
    }
    public SortedVector(){
        this(null);
    }
    public boolean add(Object o){
        super.add(o);
        Collections.sort(this, c);
        return true;
    }
}