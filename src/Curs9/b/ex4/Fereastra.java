package Curs9.b.ex4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fereastra extends JFrame implements ActionListener {
    String[] data1 = {"rosu", " galbem ", "albastru"};
    String[] data2 = {" red ", " yellow ", " blue "};
    int tipModel = 1;
    JList lst;
    ListModel model1, model2;
    public Fereastra(String titlu) {
        super(titlu);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Lista initiala nu are nici un model
        lst = new JList();
        add(lst, BorderLayout.CENTER);
        //La apasarea butonului schimbam modelul
        JButton btn = new JButton("Schimba modelul");
        add(btn, BorderLayout.SOUTH);
        btn.addActionListener(this);
        // Cream obiectele corespunzatoare celor doua modele
        model1 = new Model1();
        model2 = new Model2();
        lst.setModel(model1);
        pack();
    }

    public void actionPerformed(ActionEvent e) {
        if (tipModel == 1) {
            lst.setModel(model2);
            tipModel = 2;
        } else {
            lst.setModel(model1);
            tipModel = 1;
        }
    }

    // Clasele corespunzatoare celor doua modele
    class Model1 extends AbstractListModel {
        public int getSize() {
            return data1.length;
        }

        public Object getElementAt(int index) {
            return data1[index];
        }
    }

    class Model2 extends AbstractListModel {
        public int getSize() {
            return data2.length;
        }

        public Object getElementAt(int index) {
            return data2[index];
        }
    }

    public static void main(String[] args) {
        new Fereastra(" Text Model").show();
    }
}
