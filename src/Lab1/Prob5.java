package Lab1;

public class Prob5 {

    int powInt(int baza, int exp) {
        // exponentiere rapida
        if (exp == 0)
            return 1;
        if (exp == 1)
            return baza;

        int half =  powInt(baza, exp / 2);
        if (exp % 2 == 0)
            return half * half;
        else
            return baza * half * half;
    }

    public static void main(String[] args) {
        Prob5 pb = new Prob5();
        int a = pb.powInt(3, 4);
        int b = (int)(Math.pow(3, 4));

        System.out.println(a);
        System.out.println(b);
        //Verifica ca sunt egale
        if (a == b)
            System.out.println("egale");
        else System.out.println("diferite");

        a = pb.powInt(2, 10);
        b = (int)(Math.pow(2, 10));

        System.out.println(a);
        System.out.println(b);
        if (a == b)
            System.out.println("egale");
        else System.out.println("diferite");

        a = pb.powInt(5, 0);
        b = (int)(Math.pow(5, 0));

        System.out.println(a);
        System.out.println(b);
        if (a == b)
            System.out.println("egale");
        else System.out.println("diferite");


    }
}
