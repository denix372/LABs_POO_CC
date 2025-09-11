package Lab6.Problema2;

import Lab6.Problema1.*;

public class Test02 {
    public static void main(String[] args) {
        //Rectangle rect1 = new Shape(); //'Shape' is abstract; cannot be instantiated
        Rectangle rect1 = new Square(); //functioneaza, upcasting implicit

        Square square1 = new Square();
        Rectangle rect2 = square1; //upcasting
        Shape shape = square1; //upcasting

        // Circle c = (Circle)sq1; //Inconvertible types; cannot cast 'arhiva6.Problema1.Square' to 'arhiva6.Problema1.Circle'

        //rezolvare prin instanceof
        if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            System.out.println("Cast Square -> Circle reușit");
        } else {
            System.out.println("Nu se poate face cast din Square în Circle");
        }

        //Conversie 1
        Circle c1 = new Circle();
        // Square sq = (Square) c1; //nu se poate face downcasting

        //Conversie 2
        Square sq = new Square();
        Rectangle r = new Rectangle(5.0, 5.0);
        // sq = (Square) r; // nu se poate

        if (r instanceof Square) {
            sq = (Square) r;
            System.out.println("Conversie 2 reusita");
            // nu se poate face downcasting
        } else {
            System.out.println("Conversie 2 nereusita");
        }

        //Conversie 3
        sq = new Square(7.0);
        r = sq;
        //upcasting

    }
}
