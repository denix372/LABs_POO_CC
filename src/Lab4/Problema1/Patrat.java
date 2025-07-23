package Lab4.Problema1;

public class Patrat extends Dreptunghi{

    public Patrat(int latura){
        super(latura, latura);
    }
    @Override
    public double arie() {
        return Math.pow(latura1,2);
    }
}
