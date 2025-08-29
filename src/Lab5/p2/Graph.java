public class Graph {
    private final MyList[] adj;
    private final boolean[] visited;
    private final int n;

    public Graph(int n) {
        this.n = n;
        adj = new MyList[n + 1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new MyList();
        }
        visited = new boolean[n + 1];
    }

    public void add(int x, int y) {
        adj[x].add(y);
    }


    public void dfs(int start) {
        System.out.print(start + " ");
        visited[start] = true;

        MyList list = adj[start];
        for (int i = 0; i < list.size(); i++) {
            int neighbor = (int) list.get(i);
            if (!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i).append(": ").append(adj[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
