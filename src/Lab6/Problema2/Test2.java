package Lab6.Problema2;
import Lab6.Problema1.*;

public class Test2 {

    public  static void main(String[] args) {
        // Rectangle r = new Shape(); // SHAPE E ABSTRACT, NU POATE FI INSTANTIATA
        Rectangle r1 = new Square(5); // upcasting implicit

        Square s1 = new Square(4);
        if (s1 instanceof Rectangle) {
            r1 = s1;
            System.out.println("Square poate fi tratat ca Rectangle");
        }

        if (s1 instanceof Shape) {
            Shape sh = s1;
            System.out.println("Shape poate fi tratata ca Circle");

        }

        // Circle c = new Square(); //nu exista cast la clasa fara relatie de mostenire intre ele

        //Conversie 1
        Circle c1 = new Circle();
        // Square sq = (Square) c1; // inconvertible types
        Square sq = new Square(5);

        //Conversie 2
        Rectangle r = new Rectangle(5.0, 5.0);
        // sq = (Square) r; // INVALID, nu orice rectangle e square

        //Conversie 3
        sq = new Square(7.0);
        r = sq; // upcasting, orice square e rectangle

    }

}
