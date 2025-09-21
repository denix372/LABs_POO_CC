package Lab9.Problema5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Problema5 extends JFrame implements ActionListener {
    JButton button;
    Color[] colors = {Color.RED,Color.ORANGE, Color.YELLOW,Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.PINK};
    int index = 0;

    public Problema5() {
        super("Problema 5");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(100, 100);

        setLayout(new FlowLayout());

        button = new JButton("Colors");
        button.setMnemonic(KeyEvent.VK_C); //ALT + C
        button.addActionListener(this);

        add(button);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Color  current = colors[index];
        button.setBackground(current);
        button.setForeground(Color.WHITE);
        index = (index + 1) % colors.length;
    }

    public static void main(String[] args) {
        new Problema5();
    }
}
