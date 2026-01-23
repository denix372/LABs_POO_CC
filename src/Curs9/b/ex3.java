package Curs9.b;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class ex3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTabbedPane");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400,300);

        JTabbedPane tabbedPane = new JTabbedPane();
        ImageIcon icon = new ImageIcon("smiley.gif");
        JComponent panel1 = new JPanel();
        panel1.setOpaque(true);
        panel1.add(new JLabel("Hello"));
        tabbedPane.addTab("Tab 1", icon, panel1, "Aici avem o eticheta");
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
        JComponent panel2 = new JPanel();
        panel2.setOpaque(true);
        panel2.add(new JButton("OK"));
        tabbedPane.addTab("Tab 2", icon, panel2, "Aici avem un buton");
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

        frame.add(tabbedPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
