package Lab2;
import java.util.Collections;
import java.util.Random;
import java.util.Vector;

public class Problema3 {
    public int removeApps(Vector<Integer> v, int x) {
        int count = 0;
        int len = v.size();
        for(int i = 0; i < len; i++) {
            if(v.get(i) == x) {
                count++;
                v.remove(v.get(i));
                i--;
                len--;
            }
        }
        
        return count;
        /* Observatie
        *  for(int i = 0; i < len; i++) {
            if(v.get(i) == x) {
                count++;
                v.remove(x); /// GRESIT
                i--;
                len--;
            }
        }
        * asta nu ar fi mers deoarece v.remove(x) crede ca e un index nu un obiect de tip Integer (adica int)
        * daca voiam sa stergem folosind x trebuia sa fie:
        * for(int i = 0; i < len; i++) {
            if(v.get(i) == x) {
                count++;
                v.remove(Integer.valueOf(x));
                i--;
                len--;
            }
        }
         
        * */
        
    }
    public static void main(String[] args) {
        Problema3 pb = new Problema3();
        Random generator = new Random();
        Vector<Integer> v = new Vector<>();

        for (int i = 0; i < 20; i++) {
            int nr = generator.nextInt(10);
            v.add(nr);
        }

        System.out.println("Vector initial:" + v);
        System.out.println("numarul de aparitii ale lui " + v.get(2) + " este: " + pb.removeApps(v, v.get(2)));
        System.out.println("Vector final:" + v);

        System.out.println("valoarea maxima este: " + Collections.max(v));
        System.out.println("pozitia valorii minime este: " + v.indexOf(Collections.min(v)));

        int sum = 0;
        for (int x : v)
            sum += x;
        double av = (double)(sum)/v.size();
        System.out.println("Media elementelor elementelor din v este:" + av);
    }
}
