package Curs9.a.Swing;

import javax.swing.*;
import java.awt.*;

public class ExempluSwing2 extends JFrame {
    public ExempluSwing2(String titlu) {
        super(titlu);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // pt inchiderea ferestrei
        setLayout(new FlowLayout());
        add(new JLabel("Swing"));
        JButton b = new JButton("Close");
        add(b);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new ExempluSwing2("Hello");
    }
}
