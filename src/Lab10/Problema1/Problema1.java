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
        books.add(new Book("cppC/C++ ", "ProgrammingAuthor1", ""));
        books.add(new Book("javaJava ", "ProgrammingAuthor2", ""));
        books.add(new Book("csC# ", "ProgrammingAuthor3", ""));
        books.add(new Book("iosIOS ", "ProgrammingAuthor4", ""));
        books.add(new Book("wpWindows Phone ", "ProgrammingAuthor5", ""));
        books.add(new Book("androidAndroid ", "ProgrammingAuthor6", ""));
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
