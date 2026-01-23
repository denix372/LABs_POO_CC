package Curs9.b.ex1.d;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jframe extends JFrame {
    JButton jb;
    public jframe() {
        jb = new JButton("Click me!");
        setLayout(new FlowLayout());
        add(jb);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                        new JFrame(), "", "Event Fired!",
                        JOptionPane.PLAIN_MESSAGE
                );
            }
        });
        setSize(250,250);
        setVisible(true);
    }
    public static void main(String[] args) {
        JFrame jf = new jframe();
    }
}
