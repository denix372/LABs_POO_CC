package Curs9.a.TratareEvenimentelor;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fereastra extends Frame implements ActionListener {
    Button ok = new Button("OK");
    Button exit = new Button("Exit");
    int n = 0;

    public Fereastra(String titlu) {
        super(titlu);
        setLayout(new FlowLayout());
        setSize(200,100);
        add(ok);
        add(exit);

        ok.addActionListener(this);
        exit.addActionListener(this);
        // Ambele butoane sunt ascultate in clasa Fereastra
        // deci ascultatorul este in instanta curenta : this
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exit)
            System.exit(0); // Terminam aplicatia

        if ( e. getSource() == ok) {
            n++;
            this.setTitle("Ati apasat OK de " + n + " or");
        }
    }

}
