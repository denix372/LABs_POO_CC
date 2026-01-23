package Curs9.b.ex1.g;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jframe extends JFrame implements ActionListener {
    JButton jb;
    public jframe() {
        jb = new JButton("Click me!");
        setLayout(new FlowLayout());
        add(jb);
        jb.addActionListener(this);
        setSize(250,250);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(
                new JFrame(), "", "Event Fired!",
                JOptionPane.PLAIN_MESSAGE
        );
    }

    public static void main(String[] args) {
        JFrame jf = new jframe();
    }
}
