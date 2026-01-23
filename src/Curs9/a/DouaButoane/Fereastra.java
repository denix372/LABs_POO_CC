package Curs9.a.DouaButoane;

import java.awt.*;

public class Fereastra extends Frame {
    public Fereastra(String titlu) {
        super(titlu);
        setLayout(new FlowLayout());
        setSize(200, 100);
        Button b1 = new Button("OK");
        Button b2 = new Button("Cancel");
        add(b1);
        add(b2);
    }
}
