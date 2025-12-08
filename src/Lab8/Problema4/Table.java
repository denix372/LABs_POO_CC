package Lab8.Problema4;

import java.util.Arrays;
import java.util.Vector;

public class Table {
    Vector<Vector<Object>> rows = new Vector<>();

    public Table(Object[][] data) {
        for (Object[] row : data) {
            rows.add(new Vector<>(Arrays.asList(row)));
        }
    }

    public interface Printer {
        void print(Vector<Vector<Object>> rows);
    }

    public void print(Printer p) {
        p.print(rows);
    }

    class AsciiPrinter implements Printer{
        private int[] cols;

        public AsciiPrinter(int[] cols) {
            this.cols = cols;
        }

        @Override
        public void print(Vector<Vector<Object>> rows) {
            for (Vector<Object> row : rows) {
                for (int i = 0; i < row.size(); i++) {
                    String cell = String.valueOf(row.get(i));

                    System.out.format("%-" + cols[i] + "s", cell);
                    if (i < row.size() -1 )
                        System.out.print("| ");
                }
                System.out.println("|");
            }
        }
    }

    class CsvPrinter implements Printer {
        private String delimiter;

        public CsvPrinter() {
            this.delimiter = ",";
        }

        public CsvPrinter(String delimiter) {
            this.delimiter = delimiter;
        }

        @Override
        public void print(Vector<Vector<Object>> rows) {
            for (Vector<Object> row : rows) {
                for(int i = 0; i < row.size(); i++) {
                    System.out.print(row.get(i));
                    if ( i < row.size() - 1)
                        System.out.print(delimiter);
                }
                System.out.println();
            }
        }
    }
}
