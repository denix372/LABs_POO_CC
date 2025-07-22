package Lab1;

public class Problema5 {
    int Putere(int b, int ex) {
        if(ex==0) {
            return 1;
        }
        else {
            return b * Putere(b, ex - 1);
        }
    }
    void print(int b, int ex) {
        System.out.println(Putere(b, ex));
        System.out.println((int)Math.pow(b, ex));
    }

    public static void main(String[] args) {
        Problema5 p = new Problema5();
        p.print(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
    }
}


/* Exemplu rulare in folderul "src"
    javac Lab1/Problema5.java
    java Lab1.Problema5 3 2
 */