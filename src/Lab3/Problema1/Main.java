package Lab3.Problema1;

public class Main {
    public static void main(String[] args) {
        Fractie f1 = new Fractie(2,3);
        System.out.println(f1);
        Fractie f2 = new Fractie(3,5);
        System.out.println(f2);
        f1.suma(f2);
        System.out.println(f1);
        if(f1.equals(f2))
            System.out.println("Fractiile sunt egale");
        else System.out.println("Fractiile nu sunt egale");
    }
}
