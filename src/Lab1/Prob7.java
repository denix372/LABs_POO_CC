package Lab1;

public class Prob7 {
    public static void main(String[] args) {
        // vom citi n de la linia de comanda
        int n = Integer.parseInt(args[0]);

        // instantiem o clasa de tip Prob6 pentru a putea folosit metoda isPrime CARE E PUBLICA
        Prob6 pb = new Prob6();

        for(int p = 1; p <= n; p++)
            for (int a = 0; a <= p/2; a++)
                for (int b = a; b <= p; b ++)
                    if ( pb.isPrime(a) && pb.isPrime(b) && a + b == p)
                        System.out.println(p + " = " + a + " + " + b);
        /* Exemplu de rulare din src
        * PS D:\Documents\AN-2\SEM-1\POO\CC\src> javac Lab1\Prob7.java
        * PS D:\Documents\AN-2\SEM-1\POO\CC\src> java Lab1.Prob7 10
        */

    }
}
