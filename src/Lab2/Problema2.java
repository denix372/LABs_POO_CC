package Lab2;

import java.util.StringTokenizer;

public class Problema2 {

    int NumberSubstring(String s1, String s2) {

        StringTokenizer st = new StringTokenizer(s1," ,.");
        int count = 0;
        while (st.hasMoreTokens()) {
            if( st.nextToken().equals(s2) )
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s1 = "sir1 si sir2 sunt 2 siruri";
        String s2 = "sir2";
        Problema2 p1 = new Problema2();
        System.out.println( p1.NumberSubstring(s1,s2));

        s1 = "Marius, de ce nu l-ai ajutat pe George? Era de datoria ta sa vezi ce poti face.";
        s2 = "ce";
        System.out.println(p1.NumberSubstring(s1,s2));
    }
}
