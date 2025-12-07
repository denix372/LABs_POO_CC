package Lab4.Problema1;

public class Test {
    public static void main(String[] args) {
        Paralelogram p = new Paralelogram(2, 4, 30);
        Romb r = new Romb(5,6, 8);
        Dreptunghi d = new Dreptunghi(4, 5);
        Patrat s = new Patrat(7);

        System.out.println("arie paralelogran: " + p.arie());
        System.out.println("perimetru paralelogram: " + p.perimetru());

        System.out.println("arie romb: " + r.arie());
        System.out.println("perimetru romb: " + r.perimetru());

        System.out.println("arie dreptunghi: " + d.arie());
        System.out.println("perimetru dreptunghi: " + d.perimetru());

        System.out.println("arie patrat: " + s.arie());
        System.out.println("perimetru patrat: " + s.perimetru());
    }
}
