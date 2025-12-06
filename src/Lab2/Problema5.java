package Lab2;

public class Problema5 {
    public String cenzurare(String s1, String[] s2) {
        StringBuffer st = new StringBuffer();
        boolean isSus = false;


        for(String comp : s1.split(" ")) {
            boolean isCensored = false;
            for(String word : s2) {
                if (comp.equals(word)) {
                    isSus = true;
                    isCensored = true;
                    StringBuffer censored = new StringBuffer();

                    censored.append(word.charAt(0));
                    for (int i = 1; i < word.length() - 1; i++)
                        if(i != word.length() - 2 )
                            censored.append("* ");
                        else
                            censored.append("*");
                    censored.append(word.charAt(word.length() - 1));

                    st.append(censored);
                }
            }
            if(!isCensored)
                st.append(comp);
            st.append(" ");
        }

        if(isSus)
            System.out.println("Text suspect");
        else
            System.out.println("Nimic suspect");
        return st.toString();
    }
    public static void main(String[] args) {
        String text = "Un terorist avea o bomba";
        String[] cuvinte = new String[2];
        cuvinte[0] = "terorist";
        cuvinte[1] = "bomba";
        Problema5 prb5 = new Problema5();
        String rezultat;
        rezultat = prb5.cenzurare(text, cuvinte);
        System.out.println(rezultat);

    }
}
