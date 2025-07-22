package Lab3.Problema7;

public class Train {
    Route r;
    Schedule s;
    boolean local;

    public Train(){
        r = new Route();
        s = new Schedule();
        local = false;
    }

    public Train(Route route, Schedule schedule, boolean local){
        this.r = new Route(route);
        this.s = new Schedule(schedule);
        this.local = local;
    }

    public int ticket(){
        if(local ) {
            return s.time();
        }
        else return 2 * s.time();
    }

    @Override
    public String toString() {
        String f1 = local + " " +  r.origin + " " + s.departure + " -> ";
        String f2 = r.destination + " " + s.arrival ;
        return f1 + f2;
    }
}
