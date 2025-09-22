package Lab10.Problema4;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExplorer extends JFrame {
    private JTree fileTree;
    private JTable fileTable;
    private DefaultTableModel tableModel;

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

        JSplitPane splitPane  = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                new JScrollPane(fileTree), new JScrollPane(fileTable));
        splitPane.setDividerLocation(300);

        add(splitPane);
        setSize(800, 600);
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
