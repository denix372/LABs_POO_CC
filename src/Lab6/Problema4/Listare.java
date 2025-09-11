package Lab6.Problema4;

import java.io.*;

public class Listare {
    public static void main(String[] args) {
        try {
            File director = new File("Lab6/Arhiva6/director");

            Filtru filtru = new Filtru("Lab6/Arhiva6/extension.in", "Lab6/Arhiva6/words.in");

            afiseazaRecursiv(director, filtru);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void afiseazaRecursiv(File dir, FilenameFilter filtru) {
        File [] fisiere = dir.listFiles();
        if (fisiere != null) {
            for (File f : fisiere) {
                if(f.isDirectory()) {
                    afiseazaRecursiv(f, filtru);
                } else {
                    if (filtru.accept(dir, f.getName())) {
                        System.out.println(f.getPath());
                    }
                }
            }
        }
    }
}
