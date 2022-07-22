package Graph;

import java.util.Scanner;

public class CheckUndirected {
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
        boolean isUndirected = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = Integer.parseInt(sc.next());
            }
        }

        for (int u = 0; u < n; u++) {
            for (int v = 0; v < n; v++) {
                // in undirected graph, a[u][v] == a[v][u]
                if(a[u][v] != a[v][u]){
                    isUndirected = false;
                }
            }
        }

        if(isUndirected) System.out.println("YES");
        else System.out.println("NO");
    }
}
