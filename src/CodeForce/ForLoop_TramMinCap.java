package CodeForce;


import java.util.Scanner;

public class ForLoop_TramMinCap {
    private static int Cap(int n, int[] exit, int[] enter){
        int max = 0;
        int cap = 0;
        for (int i = 0; i < n; i++) {
            cap -= exit[i];
            cap += enter[i];
            if (cap > max) max = cap;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] exit = new int[n];
        int[] enter = new int[n];

        for (int i = 0; i < n; i++) {
            exit[i] = Integer.parseInt(sc.next());
            enter[i] = Integer.parseInt(sc.next());
        }
        System.out.println(Cap(n,exit,enter));
        sc.close();
    }
}
