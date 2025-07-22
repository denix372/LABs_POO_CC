package Lab3.Problema5;

public class Test {
    public static void main(String[] args) {
        Punct A = new Punct();
        Punct B = new Punct();
        A.setX(1);
        A.setY(2);
        B.setX(-1);
        B.setY(3);
        System.out.println(A);
        System.out.println(B);
        System.out.println(A.distance(B));
        System.out.println(A.distance(B.getX(), B.getY()));

        //Puteți accesa datele clasei Punct în metoda main din clasa Test?
        // Da, cu ajutorul metodelor getter si setter
        System.out.println(A.getX());

        //Nu direct, fara aceste metode
        //System.out.println(A.x); // <- eroare "java: x has private access in Lab3.Problema5.Punct"
    }
}
