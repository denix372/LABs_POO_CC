package Lab2;

public class Problema5 {
    //Problemza replace all
    String cenzurare(String s1, String[] s2) {
        int ok = 1;
        for(int i = 0 ; i< s2.length; i++) {
            if( s1.contains(s2[i])) {
                System.out.println("Text suspect");
                ok = 1;
                break;
            }
        }
        if(ok == 0)
            System.out.println("Nimic suspect");
        else {

            for (int i = 0; i < s2.length; i++) {
                String cuvant = s2[i];

                if (cuvant.length() >= 2) {
                    String cenzurat = cuvant.charAt(0) + "*".repeat(cuvant.length() - 2) + cuvant.charAt(cuvant.length() - 1);
                    s1 = s1.replaceAll(cuvant, cenzurat);
                }
            }
        }
        return s1;
    }

    public static void main(String[] args) {

        String text = "Un terorist avea o bomba";
        String cuvinte[] = new String[2];
        cuvinte[0] = "terorist";
        cuvinte[1] = "bomba";
        Problema5 prb5 = new Problema5();
        String rezultat;
        rezultat = prb5.cenzurare(text, cuvinte);
        System.out.println(rezultat);

    }
}
