package Lab9.Problema4;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Problema4 extends JFrame implements ChangeListener {
    JSlider redSlider, blueSlider, greenSlider;
    JTextField colorDisplay;

    public Problema4() {
        super("Problema4 - RGB Slider");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,200);
        setLayout(new BorderLayout());

        redSlider = new JSlider(JSlider.HORIZONTAL, 0 , 255, 0);
        greenSlider = new JSlider(JSlider.HORIZONTAL, 0 , 255, 0);
        blueSlider = new JSlider(JSlider.HORIZONTAL, 0 , 255, 0);

        redSlider.setMajorTickSpacing(50);
        greenSlider.setMajorTickSpacing(50);
        blueSlider.setMajorTickSpacing(50);

        redSlider.setPaintTicks(true);
        greenSlider.setPaintTicks(true);
        blueSlider.setPaintTicks(true);

        redSlider.addChangeListener(this);
        greenSlider.addChangeListener(this);
        blueSlider.addChangeListener(this);

        JPanel slidersPanel = new JPanel((new GridLayout(3, 1)));
        slidersPanel.add(new JLabel("Red"));
        slidersPanel.add(redSlider);
        slidersPanel.add(new JLabel("Green"));
        slidersPanel.add(greenSlider);
        slidersPanel.add(new JLabel("Blue"));
        slidersPanel.add(blueSlider);

        colorDisplay = new JTextField("Culoare RGB");
        colorDisplay.setHorizontalAlignment(JTextField.CENTER);
        colorDisplay.setEditable(false);
        colorDisplay.setBackground(Color.BLACK);
        colorDisplay.setBackground(Color.WHITE);

        add(slidersPanel, BorderLayout.CENTER);
        add(colorDisplay, BorderLayout.SOUTH);

        setVisible(true);
    }
    @Override
    public void stateChanged(ChangeEvent e) {
        int r = redSlider.getValue();
        int g = greenSlider.getValue();
        int b = blueSlider.getValue();

        Color newColor = new Color(r, g, b);
        colorDisplay.setBackground(newColor);
        colorDisplay.setText("RGB{" + r + ", " + g + ", " + b + "}");
    }

    public static void main(String[] args) {
        new Problema4();
    }
}
