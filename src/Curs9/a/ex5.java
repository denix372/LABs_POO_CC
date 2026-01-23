package Curs9.a;

import java.awt.*;

public class ex5 {
    public static void main(String[] args) {
        Frame f = new Frame(" Grid Layout ");
        f.setLayout(new GridLayout(3, 2));

        f.add(new Button(" 1 "));
        f.add(new Button(" 2 "));
        f.add(new Button(" 3 "));
        f.add(new Button(" 4 "));
        f.add(new Button(" 5 "));

        f.pack();
        f.show();
    }
}
