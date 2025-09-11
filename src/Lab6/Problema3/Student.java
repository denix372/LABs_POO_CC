package Lab6.Problema3;

import java.util.Vector;

public class Student implements Persoana{
    private String nume;
    private Vector<Double> medii = new Vector<>();

    public Student(String nume, Vector<Double> medii) {
        this.nume = nume;
        this.medii = new Vector<>(medii);
    }

    public Vector<Double> getMedii() {
        return medii;
    }

    public void setMedii(Vector<Double> medii) {
        this.medii = medii;
    }

    @Override
    public double calculMedieGenerala() {
        if (medii.isEmpty())
            return 0;
        double sum = 0;
        for(double m : medii)
            sum += m;
        return sum/medii.size();
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void addMedie(double medie) {
        medii.add(medie);
    }

    @Override
    public int compareTo(Object o) {
        Persoana p = (Persoana) o;
        int cmp = this.getNume().compareTo(p.getNume());
        if(cmp!=0)
            return cmp;
        return Double.compare(p.calculMedieGenerala(), this.calculMedieGenerala());
    }

    @Override
    public String toString() {
        String str = "";
        for(int i = 0; i < medii.size(); i ++) {
            if(i != medii.size() - 1)
                str +=  medii.get(i) + ", ";
            else
                str +=  medii.get(i);
        }
        return "\nNume: " + nume + "\nMedii:{ " + str + " }\n";
    }
}
