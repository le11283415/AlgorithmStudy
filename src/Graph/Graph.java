package Graph;

import java.util.Scanner;

/**
 * Created by tlh on 2016/7/9.
 * 无向图
 */
public class Graph {

    private final int V;
    private int E;
    public Bag<Edge>[] adj;

    public Graph(int V) {
        this.V = V;
        this.E = 0;
        adj = new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<Edge>();
        }
    }
    public Graph(Scanner in) {
        this(in.nextInt());
        int m=in.nextInt();
        for (int i=0;i<m;i++){
            addEdge(in.nextInt(),in.nextInt(),in.nextInt());
        }
    }
        public void addEdge(int u, int v, int w) {
        adj[u].add(new Edge(u, v, w));
        E++;
    }

    public void addEdge(int u, int v) {
        addEdge(u, v, 1);
    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    public Iterable<Edge> adj(int v) {
        return adj[v];
    }
}
