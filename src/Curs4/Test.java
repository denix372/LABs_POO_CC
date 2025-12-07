package Curs4;

public class Test {
    public static void main(String[] args) {
        Integer intObject1 = 2300; //autoboxing
        Integer intObject2 = intObject1;

        if ( intObject1 == intObject2 )
            // ce compara?
            System.out.println("Acelasi obiect");
        else
            System.out.println("Obiecte diferite");

    }
}
