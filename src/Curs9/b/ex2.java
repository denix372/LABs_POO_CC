package Curs9.b;

import javax.swing.*;

public class ex2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JScollPane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String elemente[] = new String[100];
        for (int i = 0; i < 100; i++)
            elemente[i] = "Elementul " + i;
        JList lista = new JList(elemente);
        JScrollPane sp = new JScrollPane(lista);
        frame.add(sp);

        frame.pack();
        frame.show();
    }
}
