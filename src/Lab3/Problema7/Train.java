package Lab3.Problema7;

public class Train {
    private Route r;
    private Schedule s;
    private boolean local;

    public Train(Route r, Schedule s, boolean local) {
        this.r = r;
        this.s = s;
        this.local = local;
    }

    public int getTime() {
        if(local)
            return s.getTime();
        return 2 * s.getTime();
    }

    @Override
    public String toString() {
        return local + " " + r.getOrigin() + " " + s.getDeparture() +
                " -> " + r.getDestination() + " " + s.getArrival();

    }


}
