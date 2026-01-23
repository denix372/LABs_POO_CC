package Brev9;

import javax.swing.*;
import java.awt.*;

public class Scroll extends JFrame {
    private JTextArea textArea;
    private JScrollPane scroll;

    public Scroll(String text) {
        super(text);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(300, 200));
        getContentPane().setBackground(Color.blue);
        setLayout(new FlowLayout());
        textArea = new JTextArea(200, 100);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("Tahoma", 2, 12));
        scroll = new JScrollPane(textArea);
        add(scroll);
        pack();
        setVisible(true);
    }

    public static void main(String args[]) {
        Scroll b = new Scroll("LaboratorPOO");
    }
}
