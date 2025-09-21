package Lab9.Problema6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Problema6 extends JFrame implements ActionListener {
    JTextField pathField;
    JButton loadButton;
    JTextArea fileContent;
    JScrollPane scrollPane;

    public Problema6() {
        super("Vizualizare fisier");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new FlowLayout());

        JLabel label = new JLabel("Cales: ");
        pathField =  new JTextField(25);
        loadButton = new JButton("Incarca");

        fileContent = new JTextArea(10, 30);
        fileContent.setEditable(false);
        scrollPane = new JScrollPane(fileContent);
        scrollPane.setVisible(false);

        loadButton.addActionListener(this);

        add(label);
        add(pathField);
        add(loadButton);
        add(scrollPane);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String path = pathField.getText();
        File f = new File(path);

        if ( f.exists() && !f.isDirectory()) {
            try (BufferedReader br = new BufferedReader(new FileReader(f))) {
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null)
                    sb.append(line).append("\n");
                fileContent.setText(sb.toString());
                scrollPane.setVisible(true);
                validate();
            } catch (IOException ex) {
                fileContent.setText("Eroare la citire: " + ex.getMessage());
                scrollPane.setVisible(true);
            }
        } else {
            pathField.setText("");
            scrollPane.setVisible(false);
        }
    }

    public static void main(String[] args) {
        //Lab9\Problema6\fisier.txt
        new Problema6();
    }
}
