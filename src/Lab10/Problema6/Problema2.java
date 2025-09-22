package Lab10.Problema6;
import Lab10.Problema1.Book;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class Problema2 extends JFrame {
    private final JList<Book> listBook;
    private final JTextField titleField;
    private final JTextField authorField;

    public Problema2() {
        setTitle("Aplicatie JList");
        setSize(800,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());


        JPanel infoPanel = new JPanel(new GridLayout(20, 2, 10, 10));
        JLabel titleLabel = new JLabel("Name:");
        JLabel authorLabel = new JLabel("Author:");
        titleField = new JTextField();
        authorField = new JTextField();

        infoPanel.add(titleLabel);
        infoPanel.add(titleField);
        infoPanel.add(authorLabel);
        infoPanel.add(authorField);

        DefaultListModel<Book> model = new DefaultListModel<>();
        model.addElement(new Book("cppC/C++ ", "ProgrammingAuthor1", "cpp"));
        model.addElement(new Book("javaJava ", "ProgrammingAuthor2", "java"));
        model.addElement(new Book("csC# ", "ProgrammingAuthor3", "cs"));
        model.addElement(new Book("iosIOS ", "ProgrammingAuthor4", "ios"));
        model.addElement(new Book("wpWindows Phone ", "ProgrammingAuthor5", "wp"));
        model.addElement(new Book("androidAndroid ", "ProgrammingAuthor6", "android"));

        listBook = new JList<>(model);
        listBook.setCellRenderer(new BookRenderer());

        JPanel mainPanel = new JPanel(new GridLayout(1, 2)); // 50/50 static
        JScrollPane scrollPane = new JScrollPane(listBook);
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
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Problema2().setVisible(true));
    }
}
