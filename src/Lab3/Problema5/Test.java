package Lab3.Problema5;

public class Test {
    public static void main(String[] args) {
        Punct p1 = new Punct();
        Punct p2 = new Punct();
        p1.setX(1);
        p1.setY(2);
        p2.setX(-1);
        p2.setY(3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println("Distanta dintre " + p1 + " si " + p2 + " este " + p1.distance(p2));
        System.out.println("Distanta dintre " + p2 + " si " + p1 + " este " + p2.distance(p1.getX(), p1.getY()));
    }
}
