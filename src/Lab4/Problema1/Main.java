package Lab4.Problema1;

public class Main {
    public static void main(String[] args) {
       Paralelogram par = new Paralelogram(2,3, Math.toRadians(60), Math.toRadians(120));
       Dreptunghi d = new Dreptunghi(2,3);
       Romb r = new Romb(4,Math.toRadians(30));
       Patrat pat = new Patrat(5);

        System.out.println("Aria paralelogramului este " + par.arie());
        System.out.println("Aria dreptunghiului este " + d.arie());
        System.out.println("Aria rombului este " + r.arie());
        System.out.println("Aria patratului este " + pat.arie());
    }
}
