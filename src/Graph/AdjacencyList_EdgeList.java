package Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdjacencyList_EdgeList {
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

        // No weight, directed graph
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Write adjacency list
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 1){
                    list.get(i).add(j);
                }
            }
        }

        // Print edge list
        List<Edge> edgeList = new ArrayList<>();
        Edge e;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                e = new Edge(i, list.get(i).get(j));
                edgeList.add(e);
            }
        }

        System.out.println(edgeList.size());

        for (Edge edge:
             edgeList) {
            System.out.println(edge.toString());
        }
    }
}
