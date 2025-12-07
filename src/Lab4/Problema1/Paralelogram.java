package Lab4.Problema1;

public class Paralelogram extends Patrulater{
    public Paralelogram() {
        super();
    }

    public Paralelogram(int latura1, int latura2, double unghi) {
        super(latura1, latura2, latura1, latura2,
                unghi, 180 - unghi, unghi, 180 - unghi);
    }

    public Paralelogram(int latura1, int latura2) {
        super(latura1, latura2, latura1, latura2);
    }

    public double arie() {
        return latura1 * latura2 * Math.sin( Math.toRadians(unghi1));
    }
}
