package lab11.pb5;

import lab11.pb2.Student;
import lab11.pb3.Grade;

import java.util.Collection;
import java.util.Collections;

public class BestTotalScore implements Strategy{
    @Override
    public Student getBestStudent(Collection<Grade> grades) {
        Grade maxGrade = Collections.max(grades);
        return maxGrade.getStudent();
    }
}
