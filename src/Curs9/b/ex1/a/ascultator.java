package Curs9.b.ex1.a;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ascultator implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(
                new JFrame(), "", "Event Fired!",
                JOptionPane.PLAIN_MESSAGE);
    }
}
