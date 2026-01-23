package Curs9.a.FereastraGenerala;

import java.awt.event.*;
import java.awt.*;

public class Fereastra extends Frame implements ActionListener {
    public Fereastra(String titlu) {
        super(titlu);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose(); //inchidem fereastra
                // sau terminam aplicatia
                System.exit(0);
            }
        });

        //Eventual, schimbam gestionarul de pozitionare
        setLayout(new FlowLayout());

        Button exit = new Button("Exit");
        add(exit);

        // Facem inregistrarea claselor listener
        exit.addActionListener(this);

        //Stabilim dimensiunile
        pack(); //implicit

        //sau explicit
        // setSize(200,200);
    }

    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
