package Curs9.a.Swing;

import javax.swing.*;
import java.awt.*;

public class ExempluSwing extends JFrame {
    public ExempluSwing(String titlu) {
        super(titlu);
        //Metoda setLayout nu se aplica direct ferestrei
        getContentPane().setLayout(new FlowLayout());

        // Componentele au denumiri ce incep cu litera J
        getContentPane().add(new JLabel("Swing"));

        JButton b = new JButton("Close");

        // Metoda add nu se aplica direct ferestreo
        getContentPane().add(b);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new ExempluSwing("Hello");
    }
}
