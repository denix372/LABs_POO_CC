package Lab7.Problema3;

import java.util.Comparator;

public class ReverseComparator implements Comparator {
    private final Comparator cmp;

    public ReverseComparator(Comparator cmp) {
        this.cmp = cmp;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return cmp.compare(o2, o1);
    }
}
