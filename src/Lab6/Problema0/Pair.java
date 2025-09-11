package Lab6.Problema0;

public class Pair {
    Object a, b;

    public Pair(Object a, Object b) {
        this.a = a;
        this.b = b;
    }

    public boolean equals(Object o) {
        if (o == null)
                return false;
        if(!(o instanceof Pair))
            return false;
        Pair p = (Pair)o;
        return p.a.equals(a) && p.b.equals(b);
    }

    @Override
    public String toString() {
        return "" + a + " " + b;
    }
}
