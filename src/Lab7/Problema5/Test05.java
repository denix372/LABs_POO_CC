package Lab7.Problema5;

import java.io.File;
import java.util.*;

public class Test05 {
    public static void main(String[] args) {
        String path = "Lab1";

        File folder = new File(path);
        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Director invalid: " + path);
            return;
        }

        // Cream HashMap pentru fisiere si dimensiuni
        Map<String, Integer> fileMap = new HashMap<>();

        File[] files = folder.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isFile()) {
                    int sizeKB = (int) Math.ceil(f.length() / 1024.0);
                    fileMap.put(f.getName(), sizeKB);
                }
            }
        }

        // Afisare in ordine alfabetica (TreeMap)
        System.out.println("Fișiere în ordine alfabetica:");
        Map<String, Integer> sortedByName = new TreeMap<>(fileMap);
        for (Map.Entry<String, Integer> entry : sortedByName.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " KB");
        }

        // Afisare in ordine dupa dimensiune
        System.out.println("\nFisiere in ordine dupa dimensiune:");
        List<Map.Entry<String, Integer>> list = new ArrayList<>(fileMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                return e1.getValue().compareTo(e2.getValue());
            }
        });

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " KB");
        }
    }
}
