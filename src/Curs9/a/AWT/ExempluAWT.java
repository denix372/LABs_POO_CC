package Curs9.a.AWT;

import java.awt.*;

public class ExempluAWT extends Frame {
    public ExempluAWT(String titlu) {
        super(titlu);
        setLayout(new FlowLayout());
        add(new Label ("Hello AWT"));
        Button b = new Button("Close");
        add(b);
        pack();
        show();
    }

    public static void main(String args[]) {
        new ExempluAWT("Hello");
    }
}
