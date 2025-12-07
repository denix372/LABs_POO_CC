package Lab5.Problema2;

import java.util.ArrayList;

public class Graph {
    ArrayList<MyList> lists;
    int[] visited;

    public Graph(int size) {
        lists = new ArrayList<>(size + 1);
        visited = new int[size + 1];

        for(int i = 0; i <= size; i++)
            lists.add(new MyList());
    }

    void add(int x, int y) {
        lists.get(x).add(y);
    }

    void dfs(int start) {
        System.out.print(start + ", ");
        MyList list = lists.get(start);
        visited[start] = 1;

        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                int j = (int) list.get(i);
                if(visited[j] == 0)
                    dfs(j);
            }
        }

    }

    @Override
    public String toString() {
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < lists.size(); i++) {
            st.append(i).append(": ").append(lists.get(i).toString()).append("\n");
        }
        return st.toString();
    }
}
