package Lab7.Problema2;

import java.util.LinkedList;
import java.util.Set;

public class LinkedSet<Object> extends LinkedList<Object> implements Set<Object> {

    @Override
    public boolean add(Object obj) {
        if(!contains(obj))
            return super.add(obj);
        return false;
    }

    @Override
    public void add(int index, Object obj) {
        if(!contains(obj))
            super.add(index, obj);
    }

    @Override
    public Object set(int index, Object obj) {
        int another = super.indexOf(obj);
        if( another != -1 && another != index) {
            throw new IllegalArgumentException("Elementul exista deja" + another);
        }
        return super.set(index, obj);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Set))
            return false;

        Set<Object> other = (Set<Object>) o;
        return this.size() == other.size() && this.containsAll(other);
    }

    @Override
    public int hashCode() {
        int h = 0;
        for (Object obj : this) {
            if (obj != null) {
                h += obj.hashCode();
            }
        }
        return h;
    }
}
