package Graph;

import java.util.Arrays;
import java.util.Scanner;

public class KEdgesWithSmallestWeight {
    static class Edge implements Comparable<Edge> {
        int u, v, w;

        public Edge(int u, int v, int w) {
            this.u = u;
            this.v = v;
            this.w = w;
        }

        @Override
        public String toString(){
            return String.format("%d %d", u, v);
        }

        public int compareTo(Edge o) {
            return Integer.compare(o.w, this.w); // this.w before o.w to sort ascending
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int m = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());

        Edge[] edgeList = new Edge[m];

        for (int i = 0; i < m; i++) {
            int u = Integer.parseInt(sc.next());
            int v = Integer.parseInt(sc.next());
            int w = Integer.parseInt(sc.next());
            Edge edge = new Edge(u, v, w);
            edgeList[i] = edge;
        }

        Arrays.sort(edgeList);
        for (int i = edgeList.length - k; i < edgeList.length; i++) {
            System.out.println(edgeList[i].toString());
        }

    }
}
