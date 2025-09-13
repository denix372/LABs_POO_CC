package Lab7.Problema2;

import java.util.LinkedList;
import java.util.Set;


public class LinkedSet extends LinkedList implements Set {
    @Override
    public boolean add(Object obj) {
        if(!this.contains(obj))
            return super.add(obj);
        return false;
    }

    @Override
    public void add(int index, Object obj) {
        if(!this.contains(obj))
            super.add(index, obj);
    }

    @Override
    public Object set(int index, Object obj) {
        if(!this.contains(obj))
            return super.set(index, obj);

        return this.get(index);
    }
}
