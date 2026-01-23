package lab11.pb2;

public class Student extends User{
    private Parent mother, father;

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Student(String firstName, String lastName, Parent mother, Parent father) {
        super(firstName, lastName);
        this.mother = mother;
        this.father = father;
    }

    public Parent getMother() {
        return mother;
    }

    public void setMother(Parent mother) {
        this.mother = mother;
    }

    public Parent getFather() {
        return father;
    }

    public void setFather(Parent father) {
        this.father = father;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
