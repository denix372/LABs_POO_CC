package Lab3.Problema7;

public class Schedule {
    ClockTime departure;
    ClockTime arrival;

    public Schedule(){
        this.departure = new ClockTime();
        this.arrival = new ClockTime();
    }

    public Schedule(ClockTime departure, ClockTime arrival){
        this.departure = new ClockTime(departure);
        this.arrival = new ClockTime(arrival);
    }


    public Schedule(Schedule schedule){
        this.departure = schedule.departure;
        this.arrival = schedule.arrival;
    }

    //metodă care calculează durata călătoriei în minute
    public int time(){
        if( arrival.compare(departure) > 0 )
                return arrival.time() - departure.time();
        else return  departure.time() - arrival.time();
    }

}
