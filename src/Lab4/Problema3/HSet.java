package Lab4.Problema3;

import java.util.Hashtable;

public class HSet extends Hashtable<Object, Object> {
    public HSet() {
        super();
    }

    //Adauga un element in multime, daca nu exista deja
    public boolean add(Object value) {
        if(!this.containsKey(value)) {
            this.put(value, value);
            return true;
        }
        return false;
    }

    //Sterge perechea corespunzatoare cheii, intorcand valoarea
    public Object remove(Object key) {
        return super.remove(key);
    }

    //returneaza un String cu elementele multimii (doar cheile, nu perechi)
    public String toString() {
        return this.keySet().toString();
    }
}
