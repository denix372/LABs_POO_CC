package Lab4.Problema4;

import java.util.Vector;

public class Student extends Person{
    Vector courses;
    Vector grades;

    public Student(){
        super();
        courses = new Vector<>();
        grades = new Vector<>();
    }

    public Student(String name, String address){
        super(name, address);
        courses = new Vector();
        grades = new Vector();
    }

    public void addCourseGrade(String course, int grade){
        courses.add(course);
        grades.add(grade);
    }

    @Override
    public String toString() {
        return "Studentul are numele: " + name;
    }

    public void printGrades(){
        String nr = "Notele studentului "+ name + " sunt:\n";
        for(int i = 0 ; i < grades.size(); i++){
            nr += courses.elementAt(i) + ": ";
            nr += grades.elementAt(i) + "\n";
        }
        System.out.println(nr);
    }

    public double getAverageGrade(){
        double sum = 0 ;
        for(int i = 0 ; i < grades.size(); i++){
            sum += (double)grades.elementAt(i);
        }
        return sum/grades.size();
    }


}
