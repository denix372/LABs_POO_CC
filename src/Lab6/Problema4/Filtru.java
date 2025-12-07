package Lab6.Problema4;

import java.io.*;
import java.util.*;

public class Filtru implements FilenameFilter{
    private Vector<String> extensiiAcceptate = new Vector<>();
    private Vector<String> cuvinteAcceptate = new Vector<>();

    public Filtru(String fisierExtensii, String fisierCuvinte) throws IOException {
        citesteLista(fisierExtensii, extensiiAcceptate);
        citesteLista(fisierCuvinte, cuvinteAcceptate);
    }

    private void citesteLista(String numeFisier, Vector<String> lista) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(numeFisier, "r");
        String linie;
        while ( (linie = raf.readLine()) != null) {
            linie = linie.trim();
            if( !linie.isEmpty())
                lista.add(linie.toLowerCase());
        }
        raf.close();
    }

    @Override
    public boolean accept(File dir, String nume) {
        String numeLower = nume.toLowerCase();

        boolean extensieOk = false;
        for( String ex: extensiiAcceptate) {
            if(numeLower.endsWith(ex)) {
                extensieOk = true;
                break;
            }
        }

        if(!extensieOk)
            return false;

        for(String cuv: cuvinteAcceptate) {
            if(numeLower.contains(cuv))
                return true;
        }

        return false;
    }
}