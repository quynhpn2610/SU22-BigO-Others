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

    static int power(int n, int p){
        if (p==0) return 1;
        else return n*power(n, p-1);
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

        long product = 1;
        long count = 0;
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
        final long a = (long) (power(10, 6)/7);
        product = product % a;
        System.out.print(count + " ");
        System.out.print(product);
    }
}
