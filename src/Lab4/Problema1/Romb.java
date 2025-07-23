package Lab4.Problema1;

public class Romb extends Paralelogram{
    double diagonala1, diagonala2;

    public Romb(int latura, double unghi) {
        super(latura, latura, unghi, unghi); // apelăm constructorul Patrulater
        this.diagonala1 = 2 * latura * Math.sin(unghi / 2);
        this.diagonala2 = 2 * latura * Math.cos(unghi / 2);
    }


    @Override
    public double arie() {
        return (diagonala1 * diagonala2)/2;
    }
}
