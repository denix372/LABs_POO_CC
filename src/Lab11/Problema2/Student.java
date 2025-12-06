package Lab11.Problema2;

public class Student extends User {
    private Parent mother, father;

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void setMother(Parent mother) { this.mother = mother; }
    public void setFather(Parent father) { this.father = father; }

    public boolean isParent(Observer parent) {
        return parent == mother || parent == father;
    }
}