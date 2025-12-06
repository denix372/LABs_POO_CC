package Lab11.Problema1;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;

    public Course(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course:" + name;
    }
}
