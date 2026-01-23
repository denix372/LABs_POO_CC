package Curs9.b.ex1.b;

import javax.swing.*;
import java.awt.*;

public class jframe extends JFrame {
    JButton jb;
    public jframe() {
        jb = new JButton("Click me!");
        setLayout(new FlowLayout());
        add(jb);
        jb.addActionListener(new ascultator());
        setSize(250,250);
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame jf = new jframe();
    }
}
