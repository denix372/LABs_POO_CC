package Lab10.Problema1;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class Problema1 extends JFrame {
    public Problema1() {
        setTitle("Aplicatie JList");
        setSize(400,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Vector<Book> books = new Vector<>();
        books.add(new Book("C/C++ Programming", "Author1", "cpp"));
        books.add(new Book("jJava Programming", "Author2", "java"));
        books.add(new Book("C# Programming", "Author3", "cs"));
        books.add(new Book("IOS Programming", "Author4", "ios"));
        books.add(new Book("Windows Phone Programming", "Author5", "wp"));
        books.add(new Book("Android Programming", "Author6", "android"));
        books.add(new Book("htmlHTML ", "ProgrammingAuthor7", ""));
        books.add(new Book("rustRUST ", "ProgrammingAuthor8", ""));
        books.add(new Book("pyPython ", "ProgrammingAuthor9", ""));
        books.add(new Book("asmASM ", "ProgrammingAuthor10", ""));

        JList<Book> bookList = new JList<>(books);
        JScrollPane scrollPane = new JScrollPane(bookList);

        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Problema1().setVisible(true));
    }
}
