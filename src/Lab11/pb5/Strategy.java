package lab11.pb5;

import lab11.pb2.Student;
import lab11.pb3.Grade;

import java.util.Collection;

public interface Strategy {
    Student getBestStudent(Collection<Grade> grades);
}
