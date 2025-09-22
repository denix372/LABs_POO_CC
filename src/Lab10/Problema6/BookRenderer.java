package Lab10.Problema6;

import Lab10.Problema1.Book;

import javax.swing.*;
import java.awt.*;

public class BookRenderer extends JPanel implements ListCellRenderer<Book> {
    private final JLabel titleLabel = new JLabel();
    private final JLabel authorLabel = new JLabel();
    private final JLabel iconLabel = new JLabel();

    public BookRenderer() {
        setLayout(new BorderLayout(10, 10));
        JPanel textPanel = new JPanel(new GridLayout(2, 1));
        textPanel.add(titleLabel);
        textPanel.add(authorLabel);
        add(iconLabel, BorderLayout.WEST);
        add(textPanel, BorderLayout.CENTER);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Book> list, Book book, int index,
                                                  boolean isSelected, boolean cellHasFocus) {
        titleLabel.setText(book.getName());
        authorLabel.setText(book.getAuthor());

        String iconPath = "Lab10/Problema6/Imagini/" + book.getIconName() + ".jpg";
        iconLabel.setIcon(new ImageIcon(iconPath));

        if (isSelected)
            setBackground(Color.RED);
        else
            setBackground(index % 2 == 0 ? Color.GREEN : Color.YELLOW);


        titleLabel.setOpaque(true);
        authorLabel.setOpaque(true);
        iconLabel.setOpaque(true);
        titleLabel.setBackground(getBackground());
        authorLabel.setBackground(getBackground());
        iconLabel.setBackground(getBackground());

        return this;
    }
}
