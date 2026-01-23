package Brev9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Text extends JFrame implements ActionListener {

    private JButton button;
    private JTextField user;
    private JPasswordField pass;

    public Text(String text) {
        super(text);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(300,200));
        getContentPane().setBackground(Color.blue);
        setLayout(new FlowLayout());
        button = new JButton("Apasa");
        button.addActionListener(this);
        add(button);
        user = new JTextField(15);
        add(user);
        pass = new JPasswordField(15);
        add(pass);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(user.getText() + pass.getText());
    }

    public static void main(String[] args) {
        Text b = new Text("Lab Poo");
    }
}
