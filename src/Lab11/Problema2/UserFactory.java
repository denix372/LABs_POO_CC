package Lab11.Problema2;

public class UserFactory {
    public static User createUser(String type, String firstName, String lastName) {
        switch (type) {
            case "Student":
                return new Student(firstName, lastName);
            case "Parent":
                return new Parent(firstName, lastName);
            case "Assistant":
                return new Assistant(firstName, lastName);
            case "Teacher":
                return new Teacher(firstName, lastName);
            default:
                throw new IllegalArgumentException("Unknown user type: " + type);
        }
    }
}