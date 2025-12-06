package Lab2;

public class Problema1 {
    public static void main(String[] args) {
        String s2 = "si";
        String s1 = "sir1 si cu sir2 fac un sir3";

        // Mod 1, numeri primele aparitii din indexOf in indexOf
        int pos = s1.indexOf(s2);
        int count = 0;

        while (pos != -1) {
            count++;
            pos = s1.indexOf(s2, pos + 1);
        }

        System.out.println(count);

        // Mod 2, luam fiecare subsir de lungime s2 din s1, si le numaram pe cele egale
        count = 0;
        for (int i = 0; i <= s1.length() - s2.length(); i++) {
            String sub = s1.substring(i, i + s2.length());
            if(sub.equals(s2)) {
                count++;
            }
        }
        System.out.println(count);

    }
}
