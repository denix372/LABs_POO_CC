package lab11.pb2;

public class UserFactory {
    public static User createUser(String type, String firstName, String lastName) {
        if (type.equals("Student"))
            return new Student(firstName, lastName);
        else if (type.equals("Parent"))
            return new Parent(firstName, lastName);
        else if (type.equals("Assistant"))
            return new Assistant(firstName, lastName);
        else if (type.equals("Teacher"))
            return new Teacher(firstName, lastName);
        return null;
    }
}
