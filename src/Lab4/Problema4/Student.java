package Lab4.Problema4;
import java.util.Vector;

public class Student extends Person {
    Vector<String> courses;
    Vector<Integer> grades;

    public Student(String name, String address) {
        super(name, address);
        courses = new Vector<>();
        grades = new Vector<>();
    }

    public void addCourseGrade(String course, int grade) {
        courses.add(course);
    }

    public void printGrades() {
        for(String course : courses) {
            System.out.print(course + ", ");
        }
        System.out.println();
    }

    public double getAverageGrade() {
        double sum = 0;
        for(int grade : grades)
            sum += grade;
        return sum/(grades.size());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
