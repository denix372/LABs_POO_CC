package Lab7.Problema3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;

public class Test03 {
    public static void main(String[] args) {
        String fileName = "Lab7\\test01.txt";

        // Mulțime ordonată natural (crescător)
        SListSet<String> setNatural = new SListSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Împărțim pe orice nu e literă/cifră
                String[] words = line.split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        setNatural.add(word.toLowerCase());
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Eroare la citirea fișierului: " + e.getMessage());
            return;
        }

        // Afișare ordine crescătoare
        System.out.println("Cuvinte distincte în ordine crescătoare:");
        for (String w : setNatural) {
            System.out.println(w);
        }

        // Mulțime ordonată descrescător
        SListSet<String> setDesc = new SListSet<>(Comparator.reverseOrder());
        setDesc.addAll(setNatural);

        // Afișare ordine descrescătoare
        System.out.println("\nCuvinte distincte în ordine descrescătoare:");
        for (String w : setDesc) {
            System.out.println(w);
        }
    }
}
