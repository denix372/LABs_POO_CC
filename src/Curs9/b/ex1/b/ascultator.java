package Curs9.b.ex1.b;

import javax.swing.*;
import java.awt.event.*;

public class ascultator implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(
                new JFrame(), "", "Event Fired!",
                JOptionPane.PLAIN_MESSAGE
        );

    }
}
