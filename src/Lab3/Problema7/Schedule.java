package Lab3.Problema7;

public class Schedule {
    private ClockTime departure, arrival;

    public Schedule(ClockTime departure, ClockTime arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public ClockTime getDeparture() {
        return departure;
    }

    public ClockTime getArrival() {
        return arrival;
    }

    public int getTime() {
        return arrival.getTime() - departure.getTime();
    }
}
