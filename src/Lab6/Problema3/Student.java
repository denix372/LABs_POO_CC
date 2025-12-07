package Lab6.Problema3;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Persoana {
    private String nume;
    ArrayList<Double> note = new ArrayList<>();

    public Student(String nume) {
        this.nume = nume;
    }

    public ArrayList<Double> getNote() {
        return note;
    }

    public void setNote(ArrayList<Double> note) {
        this.note = note;
    }

    @Override
    public double calculMedieGenerala() {
        double sum = 0;
        for(Double nota : note)
            sum += nota;
        return sum/note.size();
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
        note.add(medie);
        Collections.sort(note);
    }

    @Override
    public int compareTo(Object obj) {
        if (!(obj instanceof Student))
            return -1;
        Student st2 = (Student)obj;
        if(getNume().compareTo(st2.getNume()) != 0)
            return getNume().compareTo(st2.getNume());
        return (int)(st2.calculMedieGenerala() - calculMedieGenerala());
    }
}
