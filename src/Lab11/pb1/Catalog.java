package lab11.pb1;

import lab11.pb4.*;
import lab11.pb3.*;

import java.util.ArrayList;

public class Catalog implements Subject{
    private static Catalog obj = null;
    private String name;
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<Observer> observers = new ArrayList<>();

    private Catalog() {
        System.out.println("Instantiem clasa Catalog");
    }

    public void addCourse(Course c) {
        courses.add(c);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public Course getCourse(String name) {
        for (Course c : courses)
            if (c.getName().equals(name))
                return c;
        return null;
    }

    public String getName() {
        return name;
    }

    public static Catalog getInstance() {
        if (obj == null)
            obj = new Catalog();
        return obj;
    }

    // Observatori
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Grade grade) {
        for(Observer o : observers)
            if (grade.getStudent().getMother() == o ||
                    grade.getStudent().getFather() == o)
                o.update(new Notification("Studentul " + grade.getStudent() +
                        " a primit nota " + grade.getTotal() +
                        " la cursul " + grade.getCourse()));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Catalog {\n");

        sb.append("  Courses:\n");
        for (Course c : courses) {
            sb.append("    ").append(c).append("\n");
        }

        sb.append("  Observers: [");
        for (Observer o : observers) {
            sb.append(o).append(", ");
        }
        if (!observers.isEmpty())
            sb.setLength(sb.length() - 2);
        sb.append("]\n");

        sb.append("}");
        return sb.toString();
    }

}
