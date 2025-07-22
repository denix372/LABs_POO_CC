package Lab3.Problema7;

public class ClockTime {
    int hour;
    int minute;

    public ClockTime(){
        this.hour = 0;
        this.minute = 0;
    }

    public ClockTime( int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }

    public ClockTime( ClockTime c){
        this.hour = c.hour;
        this.minute = c.minute;
    }

    public int time(){
        return 60*hour + minute;
    }

    public int compare(ClockTime c2){
        int nr1 = this.time();
        int nr2 = c2.time();
        return nr1 - nr2;
    }

    @Override
    public String toString() {
        return hour + ":" + minute;
    }
}
