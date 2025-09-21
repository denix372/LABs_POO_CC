package Lab9.Problema3;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

class Problema3 extends JFrame implements ItemListener {
    JTextField quiz;
    JCheckBox r1, r2, r3, r4;
    JButton button;

    public Problema3(String fis) {
        super("Problema 3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        quiz = new JTextField(150);
        quiz.setEditable(false);

        r1 = new JCheckBox();
        r2 = new JCheckBox();
        r3 = new JCheckBox();
        r4 = new JCheckBox();

        JPanel rb=new JPanel();
        rb.setLayout(new GridLayout(4,1));
        rb.add(r1);
        rb.add(r2);
        rb.add(r3);
        rb.add(r4);

        button = new JButton("Raspunde");
        button.setEnabled(false);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateAnswers();
            }
        });

        add(quiz, BorderLayout.NORTH);
        add(rb, BorderLayout.CENTER);
        add(button,BorderLayout.SOUTH);

        r1.addItemListener(this);
        r2.addItemListener(this);
        r3.addItemListener(this);
        r4.addItemListener(this);

        pack();
        setVisible(true);
        try {
            RandomAccessFile br = new RandomAccessFile(fis,"r");
            quiz.setText(br.readLine());
            r1.setText(br.readLine());
            r2.setText(br.readLine());
            r3.setText(br.readLine());
            r4.setText(br.readLine());

        } catch (IOException ex) {
            System.err.println("Exceptie");
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        button.setEnabled(true);
    }

    private void validateAnswers() {
            r2.setForeground(Color.green);
            r4.setForeground(Color.green);

            if (r1.isSelected())
                r1.setForeground(Color.red);
            if (r3.isSelected())
                r3.setForeground(Color.red);
            button.setEnabled(false);
        }

        public static void main(String[] args) {
        Problema3 pb3 = new Problema3("Lab9/Problema3/intrebare.txt");
    }
}