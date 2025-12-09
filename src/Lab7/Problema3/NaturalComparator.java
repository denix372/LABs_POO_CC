package Lab7.Problema3;

import java.util.Comparator;

public class NaturalComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Comparable) o2).compareTo(o1);
    }
}
