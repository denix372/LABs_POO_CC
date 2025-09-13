package Lab7.Problema1;

import java.io.*;
import java.util.*;

public class DistinctWords {

    public TreeSet<String> printWords(String fileName) {
        TreeSet<String> words = new TreeSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split("\\W+");
                for (String token : tokens)
                    if (!token.isEmpty())
                        words.add(token.toLowerCase());

            }
        } catch (IOException e) {
            System.err.println("Eroare la citirea fisierului: " + e.getMessage());
        }

        System.out.println("Ordine crescatoare:");
        for (String word : words)
            System.out.println(word);

        return words;
    }

    public void printWordsComparator(TreeSet<String> originalSet) {
        TreeSet<String> reversed = new TreeSet<>(Comparator.reverseOrder());
        reversed.addAll(originalSet);

        System.out.println("\nOrdine descrescatoare");
        for (String word : reversed)
            System.out.println(word);
    }

    public static void main(String[] args) {
        DistinctWords dw = new DistinctWords();

        String fileName = "Lab7\\test01.txt";
        TreeSet<String> wordsAsc = dw.printWords(fileName);

        dw.printWordsComparator(wordsAsc);
    }

    /* rulare din src:
    javac Lab7\Problema1\DistinctWords.java
    java Lab7.Problema1.DistinctWords
     */
}
