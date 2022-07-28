package Graph;

import java.util.Scanner;

public class ProductOfLoops {
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

        boolean hasSpecial = false;

        int product = 1;
        int count = 0;
        for (Edge e:
             edgeList) {
            if (e.u == e.v){
                product *= e.w;
                count += 1;
                hasSpecial = true;
            }
        }
        if (hasSpecial == false){
            System.out.println(-1);
        }
        product = (int) (product % (Math.pow(10, 6)/7));
        System.out.print(count + " ");
        System.out.print(product);
    }
}
