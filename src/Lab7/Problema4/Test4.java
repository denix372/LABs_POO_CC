package Lab7.Problema4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        TreeMap<String, LinkedList<Integer>> dict = new TreeMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("Lab7/Problema4/test4.txt"))) {
            String line;
            int lineNumber = 1;

            while ((line = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line,  " \t,.;:!?\"'()[]{}-—");

                while (st.hasMoreTokens()) {
                    String word = st.nextToken();
                    dict.putIfAbsent(word, new LinkedList<>());
                    dict.get(word).add(lineNumber);
                }
                lineNumber++;
            }

        } catch (IOException e) {
            System.out.println("Eroare la deschiderea fisierului" + e);
        }

        Iterator<Map.Entry<String, LinkedList<Integer>>> it = dict.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<String, LinkedList<Integer>> entry = it.next();
            String word = entry.getKey();
            LinkedList<Integer> lines = entry.getValue();

            System.out.println(word);
            for(Integer ln : lines)
                System.out.println("linia[" + ln + "]");

            System.out.println("Total: " + lines.size());
        }

    }
}
