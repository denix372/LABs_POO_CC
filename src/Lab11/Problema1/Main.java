package Lab11.Problema1;

public class Main {
    public static void main(String[] args) {
        Catalog catalog = Catalog.getInstance();

        catalog.addCourse(new Course("Programare Java"));
        catalog.addCourse(new Course("Structuri de date"));
        catalog.addCourse(new Course("Design Patterns"));

        System.out.println(catalog);
    }
}
