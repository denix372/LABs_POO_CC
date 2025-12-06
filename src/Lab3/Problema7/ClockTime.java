package Lab3.Problema7;

public class ClockTime {
    private int hour, minute;

    public ClockTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getTime() {
        return 60 * hour + minute;
    }

    @Override
    public String toString() {
        if (minute < 10)
            return "(" + hour + ":0" + minute + ")";
        return "(" + hour + ":" + minute + ")";
    }
}
