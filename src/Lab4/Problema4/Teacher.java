package Lab4.Problema4;

import java.util.Vector;

public class Teacher extends Person{
    Vector<String> courses;
    public Teacher(String name, String address) {
        super(name, address);
    }

    public boolean addCourse(String course) {
        if(!courses.contains(course)) {
            courses.add(course);
            return true;
        }
        return false;
    }

    public boolean removeCourse(String course) {
        if(courses.contains(course)) {
            courses.remove(course);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
