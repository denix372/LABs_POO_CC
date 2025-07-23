package Lab4.Problema1;

public class Paralelogram extends Patrulater{
    public Paralelogram() {
        super(); // apelează Patrulater(), care setează laturi şi unghiuri cu valori zero
    }

    public Paralelogram(int latura1,int  latura2, double unghi1, double unghi2){
        super(latura1, latura2, latura1, latura2, unghi1, unghi2, unghi1, unghi2);
    }


    public double arie(){
        return latura1 * latura2 * Math.sin(unghi1);
    }
}
