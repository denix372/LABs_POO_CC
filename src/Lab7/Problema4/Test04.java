package Lab7.Problema4;

import java.io.*;
import java.util.*;

public class Test04 {
    public static void main(String[] args) {
        String fileName = "Lab7\\test01.txt";// fișierul de intrare

        // Dicționar: cuvânt -> lista numerelor de linie
        TreeMap<String, LinkedList<Integer>> dictionar = new TreeMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 0;

            while ((line = br.readLine()) != null) {
                lineNumber++;

                // Împărțim linia în cuvinte (separare pe orice caracter non-alfanumeric)
                String[] words = line.split("\\W+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        word = word.toLowerCase();

                        // Dacă nu există cuvântul în map, îl adăugăm cu listă nouă
                        dictionar.putIfAbsent(word, new LinkedList<>());

                        // Adăugăm numărul liniei în listă
                        dictionar.get(word).add(lineNumber);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Eroare la citirea fișierului: " + e.getMessage());
            return;
        }

        // Afișare folosind Iterator pe entrySet()
        Set<Map.Entry<String, LinkedList<Integer>>> entries = dictionar.entrySet();
        Iterator<Map.Entry<String, LinkedList<Integer>>> it = entries.iterator();

        while (it.hasNext()) {
            Map.Entry<String, LinkedList<Integer>> entry = it.next();
            String cuvant = entry.getKey();
            LinkedList<Integer> linii = entry.getValue();

            System.out.println(cuvant); // cuvântul pe linie nouă
            for (Integer linie : linii) {
                System.out.println("  linia " + linie);
            }
            System.out.println("  număr apariții: " + linii.size());
        }
    }
}
