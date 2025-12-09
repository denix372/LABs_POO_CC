package Lab7.Problema3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.StringTokenizer;

public class Test3 {
    public static void main(String[] args) {
        SListSet set = new SListSet();

        try {
            String content = Files.readString(Paths.get("Lab7/Problema1/test1.txt"));
            StringTokenizer st = new StringTokenizer(content, " \n\t,.;:!?\"'()[]{}-");

            while (st.hasMoreTokens()) {
                set.add(st.nextToken());
            }

            System.out.println("Ordine crescătoare:");
            for (Object s : set) {
                System.out.println(s);
            }

            SListSet reversed = set.reversed();
            System.out.println("\nOrdine descrescătoare:");
            for (Object s : reversed) {
                System.out.println(s);
            }
        }  catch (IOException e) {
            System.out.println("Eroare la citirea fișierului: " + e);
        }
    }
}
