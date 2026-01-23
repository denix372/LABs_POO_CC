package Curs9.a.DouaButoane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ascultator implements ActionListener {
    private Fereastra f;
    public Ascultator(Fereastra f) {
        this.f  = f;
    }

    public void actionPerformed(ActionEvent e) {
        f.setTitle("Ati apasat " + e.getActionCommand());
    }
}
