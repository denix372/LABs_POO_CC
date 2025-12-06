package Lab11.Problema2;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private Teacher teacher;
    private List<Assistant> assistants = new ArrayList<>();
    private List<Grade> grades = new ArrayList<>();
    private Strategy strategy;

    private Course(CourseBuilder builder) {
        this.name = builder.name;
        this.teacher = builder.teacher;
        this.assistants = builder.assistants;
        this.grades = builder.grades;
        this.strategy = builder.strategy;
    }

    public static class CourseBuilder {
        private String name;
        private Teacher teacher;
        private List<Assistant> assistants = new ArrayList<>();
        private List<Grade> grades = new ArrayList<>();
        private Strategy strategy;

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

    @Override
    public String toString() {
        return "Course: " + name + ", Teacher: " + teacher + ", Grades: " + grades.size();
    }

    public void addGrade(Grade g) {
        grades.add(g);
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public String getName() {
        return name;
    }
}
