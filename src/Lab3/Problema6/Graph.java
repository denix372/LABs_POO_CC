package Lab3.Problema6;

public class Graph {
    private int[][] matrice;
    final int Infinit;
    int n;

    public Graph(int n) {
        this.n = n;
        Infinit = 9500;
        matrice = new int[n + 1][n + 1];
    }

    int getSize() {
        return n;
    }

    void addArc(int v, int w, int cost) {
        matrice[v][w] = cost;
    }

    boolean isArc(int v, int w) {
        return matrice[v][w] != 0;
    }

    @Override
    public String toString() {
        StringBuilder st = new StringBuilder();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j ++) {
                st.append(matrice[i][j]).append(" ");
            }
            st.append('\n');
        }
        return st.toString();
    }
    public int[][] floydWarshall() {
        int result[][];
        result = new int[n+1][n+1];
        int k, i, j;
        for(i = 1; i <= n; i++) {
            for(j = 1; j <= n; j++) {
                if(i == j) {
                    result[i][j] = 0;
                } else if(isArc(i, j)) {
                    result[i][j] = matrice[i][j];
                } else {
                    result[i][j] = Infinit;
                }
            }
        }
        for(k = 1; k <= n; k++) {
            for(i = 1; i <= n; i++) {
                for(j = 1; j <= n; j++) {
                    int dist;
                    dist = result[i][k] + result[k][j];
                    if(result[i][j] > dist) {
                        result[i][j] = dist;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String args[]) {
        Graph g = new Graph(4);
        g.addArc(1, 3, 2);
        g.addArc(1, 2, 3);
        g.addArc(2, 4, 6);
        g.addArc(2, 3, 2);
        System.out.println(g);
        System.out.println("Floyd-Warshall");
        int [][] my_matrix = g.floydWarshall();
        System.out.println("distanta minima dintre nodurile 1 si 4 este "+ my_matrix[1][4]); // rezultat - 9
    }


}
