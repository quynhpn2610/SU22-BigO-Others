package Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EdgeList {
    static class Edge {
        int u, v;

        public Edge() {
        }

        public Edge(int u, int v) {
            this.u = u;
            this.v = v;
        }

        @Override
        public String toString(){
            return String.format("%d %d", u, v);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[][] a = new int[n][n];
        List<Edge> edgeList = new ArrayList<>();
        Edge edge;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = Integer.parseInt(sc.next());
            }
        }

        for (int u = 0; u < n; u++) {
            for (int v = u; v < n; v++) {
                if (a[u][v] == 1){
                    edge = new Edge(u, v);
                    edgeList.add(edge);
                }
            }
        }
        System.out.println(edgeList.size());

        for (Edge e:
             edgeList) {
            System.out.println(e.toString());
        }

        sc.close();
    }
}
