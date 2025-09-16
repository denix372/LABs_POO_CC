package Lab8.Problema4;

import java.util.*;

public class Table {

    private Vector<Vector<Object>> data;

    public Table(Object[][] rows) {
        data = new Vector<>();
        for(Object[] row : rows) {
            Vector<Object> r = new Vector<>(Arrays.asList(row));
            data.add(r);
        }
    }

    public interface Printer {
        void print(Vector<Vector<Object>> data);
    }

    public void print(Printer p) {
        p.print(data);
    }

    public class CsvPrinter implements Printer {
        private String delimiter = ",";

        @Override
        public void print(Vector<Vector<Object>> data) {
            for(Vector<Object> row: data) {
                for (int i = 0; i < row.size(); i++) {
                    System.out.print(row.get(i));
                    if( i < row.size() - 1)
                        System.out.print(delimiter);
                }
                System.out.println();
            }
        }
    }

    public class AsciiPrinter implements Printer {
        private int[] columnWidths;

        public AsciiPrinter(int[] columnWidths) {
            this.columnWidths = columnWidths;
        }

        @Override
        public void print(Vector<Vector<Object>> data) {
            for(Vector<Object> row: data) {
                for (int i = 0; i < row.size(); i++) {
                    String cell = row.get(i).toString();
                    System.out.print(pad(cell, columnWidths[i]));
                    if (i < row.size() - 1)
                        System.out.print("|");
                }
                System.out.println("|");
            }
        }
        private String pad(String text, int width) {
            if (text.length() > width) {
                return text.substring(0, width);
            }
            return String.format("%-" + width + "s", text);
        }
    }
}
