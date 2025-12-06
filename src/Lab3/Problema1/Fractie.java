package Lab3.Problema1;

public class Fractie {
    int x, y;
    public Fractie(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Fractie() {
        this(0,0);
    }

    public Fractie suma(Fractie f) {
        int numitor = this.y * f.y;
        int numarator = this.x * f.y + this.y * f.x;
        return new Fractie(numarator, numitor);
    }

    @Override
    public String toString() {
        return x + "/" + y;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;

        Fractie f = (Fractie)obj;
        return this.x * f.y == this.y * f.x;
    }

    public static void main(String[] args) {
        Fractie f1 = new Fractie(1,2);
        Fractie f2 = new Fractie(3, 4);
        Fractie f3 = new Fractie(5, 4);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f1.suma(f2));
        if( f1.suma(f2).equals(f3))
            System.out.println("Fractia " + f1.suma(f2) + " si fractia " + f3 + " sunt egale");
        else
            System.out.println("Fractia " + f1.suma(f2) + " si fractia " + f3 + " NU sunt egale");
    }
}
