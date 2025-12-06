package Lab1;

public class Prob2 {

    void printInt(int a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        Prob2 obiect = new Prob2(); // creare obiect de tip Prob2
        obiect.printInt(42); //apelare metoda printInt
        obiect.printInt(7 + 5);
        obiect.printInt(3 * 10);
    }

}
