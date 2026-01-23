package lab11.pb5;

import lab11.pb2.Student;
import lab11.pb3.Grade;

import java.util.Collection;

public class BestExamScore implements Strategy{
    @Override
    public Student getBestStudent(Collection<Grade> grades) {
        Grade maxGrade = null;
        for(Grade g : grades) {
            if(maxGrade == null || g.getExamScore() > maxGrade.getExamScore())
                maxGrade = g;
        }
        return maxGrade.getStudent();
    }
}
