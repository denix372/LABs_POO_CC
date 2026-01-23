package lab11.pb6;

import lab11.pb2.Assistant;
import lab11.pb2.Teacher;

public interface Visitor {
    void visit(Assistant assistant);
    void visit(Teacher teacher);
}
