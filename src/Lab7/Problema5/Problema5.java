package Lab7.Problema5;

import java.io.File;
import java.util.*;

public class Problema5 {
    public static void main(String[] args) {
        String path;
        if(args.length > 0)
            path = args[0];
        else
            path = ".";

        File dir = new File(path);
        if (!dir.isDirectory()) {
            System.out.println("Calea nu e un director valid!");
            return;
        }

        HashMap<String, Integer> fileMap = new HashMap<>();
        File[] files = dir.listFiles();

        if (files != null)
            for (File f : files)
                if (f.isFile()) {
                    long bytes = f.length();
                    int kib = (int)((bytes + 1023)/1024);
                    fileMap.put(f.getName(), kib);
                }

        TreeMap<String, Integer> sortedByName = new TreeMap<>(fileMap);

        System.out.println("- Afisare in ordine alfabetica - ");
        for (Map.Entry<String, Integer> entry : sortedByName.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue() + " KiB");

        List<Map.Entry<String, Integer>> sortedBySize = new ArrayList<>(fileMap.entrySet());
        sortedBySize.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                return Integer.compare(e2.getValue(), e1.getValue());
            }
        });

        System.out.println("\n - Fisiere in ordine descrescatoare - ");
        for(Map.Entry<String, Integer> entry : sortedBySize)
            System.out.println(entry.getKey() + " - " + entry.getValue() + " KiB");
    }
}
