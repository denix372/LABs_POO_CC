package Curs9.a;

import java.awt.*;

public class ex2 {
    public static void main(String[] args) {
        Frame f = new Frame("O fereastra");

        // Adaugam un buton direct pe fereastra
        Button b = new Button("Hello");
        f.add(b);

        // Adaugam doua componente pe un panel
        Label et = new Label("Nume: ");
        TextField text = new TextField();
        Panel panel = new Panel();
        panel.add(et);
        panel.add(text);

        // Adaugam panel-ul pe fereastra
        // si, indirect, cele doua component
        f.add(panel);
        f.pack();
        f.show();
    }
}
