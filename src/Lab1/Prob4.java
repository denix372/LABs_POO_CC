package Lab1;

public class Prob4 {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        // SAU
        for(String arg : args) {
            System.out.println(arg);
        }

        /* Exemplu rulare din directorul src
        *   PS D:\Documents\AN-2\SEM-1\POO\CC\src> java Lab1.Prob4
        *  PS D:\Documents\AN-2\SEM-1\POO\CC\src> java Lab1.Prob4 ana are mere
        */
    }
}
