package Lab7.Problema6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class Problema6 {
    public static LruCache runOps(String opsFile, int capacity) throws IOException {
        LruCache cache = new LruCache(capacity);

        try(BufferedReader br = new BufferedReader(new FileReader(opsFile))) {
            String line;

            while ((line = br.readLine()) != null) {
                line = line.trim();

                if (line.isEmpty() || line.startsWith("#"))
                    continue;

                if(line.startsWith("PUT")) {
                    String[] parts = line.split("\\s+");
                    if(parts.length == 3) {
                        String key = parts[1];
                        String value = parts[2];

                        if (key == null) {
                            System.out.println("Cheie null interzisa");
                            continue;
                        }
                        cache.put(key, value);
                    }
                } else if (line.startsWith("GET")) {
                    String[] parts = line.split("\\s+");
                    if (parts.length == 2) {
                        String key = parts[1];
                        Object val = cache.get(key);
                        if (val != null)
                            System.out.println(val);
                        else
                            System.out.println("NULL");
                    }

                }
            }
        }
        return cache;
    }

    public static void printCache(LruCache cache) {
        for(Object obj : cache.entrySet()) {
            Map.Entry e = (Map.Entry) obj;
            System.out.println(e.getKey() + "=" + e.getValue());
        }
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Utilizare: java Problema6 <capacitate> <fisier_ops>");
            return;
        }

        int capacity = Integer.parseInt(args[0]);
        String opsFile = args[1];

        try {
            LruCache cache = runOps(opsFile, capacity);
            System.out.println("---");
            printCache(cache);
        } catch (IOException e) {
            System.out.println("Eroare la citira fisierului: " + e.getMessage());
        }

        /* Exemplu de rulare din directorul src
        * javac Lab7\Problema6\LruCache.java Lab7\Problema6\Problema6.java
        *  java Lab7.Problema6.Problema6 3 Lab7/Problema6/test6.txt
        * */
    }
}
