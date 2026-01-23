package Brev9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JFrame implements ActionListener {
    private JButton button;

    public Button(String text) {
        super(text);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(300, 200));
        getContentPane().setBackground(Color.blue);
        setLayout(new SpringLayout());
        button = new JButton("Apasa");
        button.addActionListener(this);
        add(button);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        Button b = new Button("LabPoo");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Butonul a fost apasat!");
    }
}

