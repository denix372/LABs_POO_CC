package lab11.pb3;

import lab11.pb2.*;
import lab11.pb5.BestPartialScore;
import lab11.pb5.Strategy;

import java.util.ArrayList;

public class Course {
    String name;
    Teacher teacher;
    ArrayList<Assistant> assistants;
    ArrayList<Grade> grades;
    ArrayList<Student> students;
    Strategy strategy;

    private Course(CourseBuilder builder) {
        this.name = builder.name;
        this.teacher = builder.teacher;
        this.assistants = builder.assistants;
        this.students = builder.students;
        this.grades = builder.grades;
        this.strategy = builder.strategy;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public ArrayList<Assistant> getAssistants() {
        return assistants;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addGrade(Grade g) {
        grades.add(g);
    }

    public Grade getGrade(Student s) {
        for (Grade g : grades)
            if (g.getStudent().equals(s))
                return g;
        return null;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course {\n");
        sb.append("  Name: ").append(name).append("\n");
        sb.append("  Teacher: ").append(teacher).append("\n");

        sb.append("  Assistants: [");
        for (Assistant a : assistants) {
            sb.append(a).append(", ");
        }
        if (!assistants.isEmpty())
            sb.setLength(sb.length() - 2);
        sb.append("]\n");

        sb.append("  Students: [");
        for (Student s : students) {
            sb.append(s).append(", ");
        }
        if (!students.isEmpty())
            sb.setLength(sb.length() - 2);
        sb.append("]\n");

        sb.append("  Grades:\n");
        for (Grade g : grades) {
            sb.append("    - Student: ").append(g.getStudent())
                    .append(", Partial: ").append(g.getPartialScore())
                    .append(", Exam: ").append(g.getExamScore())
                    .append(", Total: ").append(g.getTotal())
                    .append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

    public static class CourseBuilder {
        String name;
        Teacher teacher;
        ArrayList<Assistant> assistants = new ArrayList<>();
        ArrayList<Grade> grades = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        Strategy strategy;

        public CourseBuilder(String name) {
            this.name = name;
        }

        public CourseBuilder teacher(Teacher teacher) {
            this.teacher = teacher;
            return this;
        }

        public CourseBuilder assistant(Assistant assistant) {
            this.assistants.add(assistant);
            return this;
        }

        public CourseBuilder grade(Grade grade) {
            this.grades.add(grade);
            if (!this.students.contains(grade.getStudent()))
                this.students.add(grade.getStudent());
            return this;
        }

        public CourseBuilder student(Student student) {
            this.students.add(student);
            return this;
        }

        public CourseBuilder strategy(Strategy strategy) {
            this.strategy = strategy;
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }

    public Student getBestStudent() {
        return strategy.getBestStudent(grades);
    }
}
