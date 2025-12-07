package Lab4.Problema1;

public class Romb extends Paralelogram {
    double diagonala1, diagonala2;

    public Romb(int latura, double diagonala1, double diagonala2) {
        super(latura, latura);
        this.diagonala1 = diagonala1;
        this.diagonala2 = diagonala2;
    }

    @Override
    public double arie() {
        return (diagonala1 * diagonala2) / 2;
    }
}
