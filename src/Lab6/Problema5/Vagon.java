package Lab6.Problema5;

public abstract class Vagon implements Comparable{
    int colete;
    boolean usi;
    public abstract int getColete();

    @Override
    public int compareTo(Object obj) {
        if(!(obj instanceof Vagon))
            return -1;
        Vagon v = (Vagon)obj;
        return getColete() - v.getColete();
    }
}
