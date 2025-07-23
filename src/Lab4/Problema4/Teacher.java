package Lab4.Problema4;

import java.util.Vector;

public class Teacher extends Person{
    Vector courses;

    public Teacher(String name, String address){
        super(name, address);
    }

    @Override
    public String toString() {
        return "Profesorul are numele: " + name;
    }

    public boolean addCourse(String course){
        return courses.add(course);
    }

    public boolean removeCourse(String course){
        return courses.remove(course);
    }
}
