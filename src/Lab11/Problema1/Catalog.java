package Lab11.Problema1;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private static Catalog instance = null;
    private List<Course> courses;

    private Catalog(){
        courses = new ArrayList<>();
    }

    public static Catalog getInstance() {
        if (instance == null)
            instance = new Catalog();
        return instance;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Catalog:\n");
        for (Course c : courses) {
            sb.append(c.toString()).append("\n");
        }
        return sb.toString();
    }
}
