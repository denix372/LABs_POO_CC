package Lab2;

public class Problema1 {
    public static void main(String[] args) {
        String s2 = "si";
        String s1 = "sir1 si cu sir2 fac un sir3";

        //metoda 1
        int aparitii = 0;
        int index = s1.indexOf(s2);

        while (index != -1) {
            aparitii++;
            index = s1.indexOf(s2, index + 1);
        }

        System.out.println(aparitii);

        //metoda2
        aparitii = 0;
        for(int i=0; i< s1.length() - s2.length(); i++){
            String sub1= s1.substring(i, i+ s2.length() );
            if ( sub1.equals(s2)){
                aparitii++;
            }
        }
        System.out.println(aparitii);

    }
}
