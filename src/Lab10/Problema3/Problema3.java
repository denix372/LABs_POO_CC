package Lab10.Problema3;
import Lab10.Problema1.Book;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Problema3 extends JFrame {
    private final JList<Book> listBook;
    private final JTextField titleField;
    private final JTextField authorField;
    private final DefaultListModel<Book> model;

    public Problema3() {
        setTitle("Aplicatie JList");
        setSize(800,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        model = new DefaultListModel<>();
        model.addElement(new Book("C/C++ Programming", "Author1", "cpp"));
        model.addElement(new Book("jJava Programming", "Author2", "java"));
        model.addElement(new Book("C# Programming", "Author3", "cs"));
        model.addElement(new Book("IOS Programming", "Author4", "ios"));
        model.addElement(new Book("Windows Phone Programming", "Author5", "wp"));
        model.addElement(new Book("Android Programming", "Author6", "android"));


        listBook = new JList<>(model);
        JScrollPane scrollPane = new JScrollPane(listBook);

        JPanel infoFieldsPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        JLabel titleLabel = new JLabel("Name:");
        JLabel authorLabel = new JLabel("Author:");
        titleField = new JTextField();
        authorField = new JTextField();
        infoFieldsPanel.add(titleLabel);
        infoFieldsPanel.add(titleField);
        infoFieldsPanel.add(authorLabel);
        infoFieldsPanel.add(authorField);


        JPanel infoPanel = new JPanel(new BorderLayout());
        infoPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        infoPanel.add(infoFieldsPanel, BorderLayout.NORTH);

        JButton removeButton = new JButton("Remove");
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(removeButton);
        infoPanel.add(buttonPanel, BorderLayout.SOUTH);

        JPanel mainPanel = new JPanel(new GridLayout(1, 2));
        mainPanel.add(scrollPane);
        mainPanel.add(infoPanel);

        add(mainPanel, BorderLayout.CENTER);

        listBook.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(listBook.isSelectionEmpty())
                    return;

                Book selectedBook = listBook.getSelectedValue();
                titleField.setText(selectedBook.getName());
                authorField.setText(selectedBook.getAuthor());
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = listBook.getSelectedIndex();
                if(selectedIndex != -1) {
                    model.remove(selectedIndex);
                    titleField.setText("");
                    authorField.setText("");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Problema3().setVisible(true));
    }
}
