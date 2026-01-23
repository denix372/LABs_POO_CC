package lab11.pb2;

import lab11.pb6.Element;
import lab11.pb6.Visitor;

public class Teacher extends User implements Element {
    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
