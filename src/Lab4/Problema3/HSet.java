package Lab4.Problema3;

import java.util.Hashtable;

public class HSet extends Hashtable {

    public HSet(){
        super();
    }

    public boolean add(Object key) {
        return super.put(key, Boolean.TRUE) == null;
    }

    @Override
    public Object remove(Object key) {
        return super.remove(key);
    }

    @Override
    public String toString() {
        return this.keySet().toString();
    }
}
