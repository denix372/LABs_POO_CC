package Curs5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Error {
    public static void readFile(String fis) {
        FileReader f = null;
        try {
            // Deschidem fisierul
            f = new FileReader(fis);
            // Citim si afisam caracter cu caracter
            int c;
            while ((c = f.read()) != -1)
                System.out.print((char) c);
        } catch (FileNotFoundException e) {
            //Tratam un tip de exceptie
            System.err.println("Fisierul nu a fost  gasit");
        } catch (IOException e) {
            //Tratam alt tip de exceptie
            System.out.println("Eroare la citire");
            e.printStackTrace();
        } finally {
            if (f != null) {
                // Inchidem fisierul
                try {
                    f.close();
                }
                catch (IOException e) {
                    System.err.println("Fisierul nu poate fi inchis!");
                    e.printStackTrace();
                } // catch
            } // if
        } // finally
    }

    public static void main(String args[]){
        if (args.length > 0) {
            readFile(args[0]);
        } else
            System.out.println("Lipseste numele fisierului");
    } // main
} // clasa

