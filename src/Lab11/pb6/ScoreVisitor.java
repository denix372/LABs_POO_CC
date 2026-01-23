package lab11.pb6;

import lab11.pb1.*;
import lab11.pb2.*;
import lab11.pb3.*;

import java.util.ArrayList;
import java.util.HashMap;

public class ScoreVisitor implements Visitor {
    private HashMap<Teacher, ArrayList<Pair<Student, String, Double>>> examScores;
    private HashMap<Assistant, ArrayList<Pair<Student, String, Double>>> partialScores;

    public ScoreVisitor(
            HashMap<Teacher, ArrayList<Pair<Student, String, Double>>> examScores,
            HashMap<Assistant, ArrayList<Pair<Student, String, Double>>> partialScores) {
        this.examScores = examScores;
        this.partialScores = partialScores;
    }

    public void visit(Assistant assistant) {
        ArrayList<Pair<Student, String, Double>> list = partialScores.get(assistant);
        if (list == null)
            return;

        for (Pair<Student, String, Double> p : list) {
            Student s = p.getKey();
            String courseName = p.getValue1();
            Double score = p.getValue2();

            Course c = Catalog.getInstance().getCourse(courseName);
            if (c != null) {
                Grade g = c.getGrade(s);

                if (g == null) {
                    g = new Grade(courseName, s);
                    c.addGrade(g);
                }

                g.setPartialScore(score);
            }
        }
    }

    public void visit(Teacher teacher) {
        ArrayList<Pair<Student, String, Double>> list = examScores.get(teacher);
        if (list == null)
            return;

        for (Pair<Student, String, Double> p : list) {
            Student s = p.getKey();
            String courseName = p.getValue1();
            Double score = p.getValue2();

            Course c = Catalog.getInstance().getCourse(courseName);
            if (c != null) {
                Grade g = c.getGrade(s);

                if (g == null) {
                    g = new Grade(courseName, s);
                    c.addGrade(g);
                }

                g.setExamScore(score);
            }
        }
    }

}