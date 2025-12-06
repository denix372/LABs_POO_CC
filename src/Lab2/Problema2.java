package Lab2;
import java.util.StringTokenizer;

public class Problema2 {

    public int countSplit(String s1, String s2) {
        int count = 0;
        String[] splits = s1.split(" ");

        for (String split : splits)
            if(split.equals(s2))
                count++;

        return count;
    }

    public int countToken(String s1, String s2) {
        int count = 0;
        StringTokenizer st = new StringTokenizer(s1, " ,.-?");

        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            if (token.equals(s2))
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Problema2 pb = new Problema2();
        String s1 = "sir1 si sir2 sunt 2 siruri";
        String s2 = "sir";
        String s3 = "sir2";

        System.out.println(pb.countSplit(s1, s2));
        System.out.println(pb.countSplit(s1, s3));

        String s4 = "Marius, de ce nu l-ai ajutat pe George? Era de datoria ta sa vezi ce poti face.";
        String s5 = "ce";
        String s6 = "l";

        System.out.println(pb.countToken(s4, s5));
        System.out.println(pb.countToken(s4, s6));

    }
}
