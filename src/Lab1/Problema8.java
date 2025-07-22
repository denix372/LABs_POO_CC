package Lab1;

public class Problema8 {
    public static void main(String[] args) {
        int n = 10;
        double[] vector = new double[n];

        for (int i = 0; i < n; i++) {
            vector[i] = Math.random() * 100;
        }

        java.util.Arrays.sort(vector);

        for (double val : vector) {
            System.out.println(val);
        }

        double cautat = vector[6];
        int pozitie = java.util.Arrays.binarySearch(vector, cautat);
        System.out.println("Elementul " + cautat + " se află la poziția " + pozitie);
    }
}
