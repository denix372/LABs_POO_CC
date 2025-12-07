package Lab7.Problema1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Problema1 {
    public TreeSet<String> printWords(String fileName) throws IOException {
        TreeSet<String> tree = new TreeSet<>();

        String content = Files.readString(Paths.get(fileName));
        StringTokenizer st = new StringTokenizer(content, " \n\t,.;:!?\"'()[]{}-");

        while (st.hasMoreTokens()) {
            tree.add(st.nextToken());
        }

        System.out.println("Ordinea din fisier:");
        for (String s : tree)
            System.out.println(s);

        return tree;
    }

    public TreeSet<String> printWordsComparator(TreeSet<String> asc) {
        TreeSet<String> tree = new TreeSet<>();
        return tree;
    }

    public static void main(String[] args) {
        Problema1 pb = new Problema1();
        TreeSet<String> words = null;
        TreeSet<String> reversed = new TreeSet<>(new Reverse());

        try {
            words = pb.printWords("Lab7/Problema1/test1.txt");
        } catch (IOException e) {
            System.out.println("Eroare la deschiderea fisierului: " + e);
        } finally {
            if (words != null) {
                for(String s : words)
                    reversed.add(s);

                System.out.println("\nOrdine descrescatoare:\n");
                for (String s : reversed)
                    System.out.println(s);
            }
        }
    }
}
