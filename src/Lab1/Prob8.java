package Lab1;
import java.util.Arrays;
// link:
public class Prob8 {
    public static void main(String[] args) {
        int n = 12;
        int[] v = new int[n];

        for (int i = 0;i < v.length; i++) {
            v[i] = (int) (Math.random() * 100); // 0..99
            System.out.print(v[i] + " ");
        }

        Arrays.sort(v);
        System.out.println();
        for(int x : v)
            System.out.print(x + " ");

        int pos = Arrays.binarySearch(v, v[4]);
        System.out.println("\nElementul " + v[4] + " se gaseste pe pozitia " + pos);
    }
}
