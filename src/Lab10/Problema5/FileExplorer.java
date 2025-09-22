package Lab10.Problema5;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import javax.swing.tree.*;
import java.awt.*;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExplorer extends JFrame {
    private final JTree fileTree;
    private final JTable fileTable;
    private final DefaultTableModel tableModel;

    public FileExplorer(File rootDir) {
        super("File Browser");

        DefaultMutableTreeNode rootNode = createTreeNodes(rootDir);
        fileTree = new JTree(rootNode);
        fileTree.setRootVisible(true);

        fileTree.addTreeSelectionListener(e -> {
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) fileTree.getLastSelectedPathComponent();
            if ( selectedNode != null) {
                File selectedFile = (File) selectedNode.getUserObject();
                if( selectedFile.isDirectory())
                    updateTable(selectedFile);
            }
        });

        String[] columns = {"File Name", "Dimension", "Last Modified", "Type"};
        tableModel = new DefaultTableModel(columns, 0);
        fileTable = new JTable(tableModel);

        JTextField rowField = new JTextField(5);
        JTextField colField = new JTextField(5);
        rowField.setEditable(false);
        colField.setEditable(false);
        rowField.setPreferredSize(new Dimension(60, 25));
        colField.setPreferredSize(new Dimension(60, 25));


        // Panou cu JTextField-uri (dreapta)
        JPanel selectionPanel = new JPanel();
        selectionPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        selectionPanel.add(new JLabel("Linie:"));
        selectionPanel.add(rowField);
        selectionPanel.add(Box.createVerticalStrut(10));
        selectionPanel.add(new JLabel("Coloana:"));
        selectionPanel.add(colField);

// Panou central cu tabel
        JScrollPane tableScroll = new JScrollPane(fileTable);

// SplitPane între tabel și JTextFields
        JSplitPane centerSplit = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                tableScroll, selectionPanel);
        centerSplit.setDividerLocation(500);

// SplitPane între arbore și restul
        JSplitPane mainSplit = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                new JScrollPane(fileTree), centerSplit);
        mainSplit.setDividerLocation(250);



        add(mainSplit);


        ListSelectionModel rowSM = fileTable.getSelectionModel();
        rowSM.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int row = fileTable.getSelectedRow();
                    rowField.setText(row >= 0 ? String.valueOf(row) : "");
                }
            }
        });

        ListSelectionModel colSM = fileTable.getColumnModel().getSelectionModel();
        colSM.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int col = fileTable.getSelectedColumn();
                    colField.setText(col >= 0 ? String.valueOf(col) : "");
                }
            }
        });


        setSize(1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private DefaultMutableTreeNode createTreeNodes(File dir) {
        DefaultMutableTreeNode node = new DefaultMutableTreeNode(dir);
        File[] files = dir.listFiles();
        if (files != null) {
            for ( File f: files) {
                if ( f. isDirectory()) {
                    node.add(createTreeNodes(f));
                } else {
                    node.add(new DefaultMutableTreeNode(f));
                }
            }
        }
        return node;
    }

    private void updateTable(File dir) {
        tableModel.setRowCount(0);
        File[] files = dir.listFiles();
        if ( files!= null) {
            for (File f : files) {
                String name = f.getName();
                String size = f.isFile() ? String.valueOf(f.length() ): "-";
                String modified = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(f.lastModified()));
                String type = f.isDirectory() ? "Folder" : "File";
                tableModel.addRow(new Object[]{name, size, modified, type});
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            File rootDir = new File(".").getAbsoluteFile();
            new FileExplorer(rootDir).setVisible(true);
        });
    }
}
