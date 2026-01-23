package Curs9.a;

import java.awt.*;

public class ex1 {
    public static void main(String[] args) {
        // Crearea ferestrei-obiect de tip Frame
        Frame f = new Frame("O fereastra");

        //Setare mod dispunere a componentelor
        f.setLayout(new FlowLayout());

        // Crearea celor doua butoane
        Button b1 = new Button("OK");
        Button b2 = new Button("Cancel");

        // Adaugarea butoanelor
        f.add(b1);
        f.add(b2);

        f.pack();
        // Afisarea fereastrei
        f.show();
    }
}
