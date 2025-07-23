package Lab4.Problema1;

public class Dreptunghi extends Paralelogram{

    public Dreptunghi(int lungime, int latime) {
        super(lungime, latime, Math.PI/2, Math.PI/2);
    }


    @Override
    public double arie() {
        return latura1 * latura2;
    }
}
