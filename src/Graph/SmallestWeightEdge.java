package Graph;

import java.util.Scanner;

public class SmallestWeightEdge {
    static class Edge{
        int u, v, w;

        public Edge(int u, int v, int w) {
            this.u = u;
            this.v = v;
            this.w = w;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Edge[] edgeList = new Edge[n];

        for (int i = 0; i < n; i++) {
            int u = Integer.parseInt(sc.next());
            int v = Integer.parseInt(sc.next());
            int w = Integer.parseInt(sc.next());
            Edge edge = new Edge(u, v, w);
            edgeList[i] = edge;
        }

        int minw = edgeList[0].w;
        for (Edge e:
             edgeList) {
            if(e.w < minw){
                minw = e.w;
            }
        }

        int count = 0;
        for (Edge e:
             edgeList) {
            if (e.w == minw){
                count += e.w;
            }
        }

        System.out.println(count);

    }
}
