package Lab1;

public class Prob6 {
    public boolean isPrime(int n) {
        if (n == 1 || n == 2)
            return true;
        if (n % 2 == 0)
            return false;

        for (int i = 3; i * i <= n; i += 2)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        Prob6 pb = new Prob6();
        for (int i = 1; i <= 20; i++)
            if (pb.isPrime(i))
                System.out.println(i + " e prim ");
            else
                System.out.println(i + " nu e prim");
    }
}