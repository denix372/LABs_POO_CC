package Lab3.Problema7;

public class Test {
    public static void main(String[] args) {
        ClockTime c1 = new ClockTime(9, 35);
        ClockTime c2 = new ClockTime(12, 2);
        ClockTime c3 = new ClockTime(5, 45);
        ClockTime c4 = new ClockTime(12, 49);
        ClockTime c5 = new ClockTime(23, 45);
        ClockTime c6 = new ClockTime(17, 0);

        Schedule s1 = new Schedule(c1, c2);
        Schedule s2 = new Schedule(c3, c4);
        Schedule s3 = new Schedule(c5, c6);

        Route r1 = new Route("Bucuresti Nord", "Constanta");
        Route r2 = new Route("Bucuresti Nord", "Iasi");
        Route r3 = new Route("Bucuresti Nord", "Sofia");

        Train t1 = new Train(r1, s1, true);
        Train t2 = new Train(r2, s2, true);
        Train t3 = new Train(r3, s3, false);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
