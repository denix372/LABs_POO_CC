package Lab4.Problema2;

import java.util.Collections;
import java.util.Vector;

//prin mostenire
public class SortedArray extends Array{
    public SortedArray(){
        super();
    }

    @Override
    public void addElement(Integer x) {
        super.addElement(x);
        sort();
    }

    @Override
    public String toString() {
        String result = "{";
        for(int i = 0; i < getSize(); i++) {
            result += get(i) + ", ";
        }
        result += "}";
        return result;
    }


}
