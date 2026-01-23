package Curs9.b;

import javax.swing.*;
import java.awt.*;

public class ExempluSwing extends JFrame {
    JButton b;
    public ExempluSwing(String titlu) {
        super(titlu);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(new JLabel("Swing"));
        b = new JButton("Close");
        add(b);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new ExempluSwing("Hello");
    }

}
