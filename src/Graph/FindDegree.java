package Graph;

import java.util.Scanner;

public class FindDegree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfVertex = Integer.parseInt(sc.next());
        int vertex = Integer.parseInt(sc.next());
        int[][] a = new int[numberOfVertex][numberOfVertex];
        for (int i = 0; i < numberOfVertex; i++) {
            for (int j = 0; j < numberOfVertex; j++) {
                a[i][j] = Integer.parseInt(sc.next());
            }
        }

        int count = 0;
        for (int j = 0; j < numberOfVertex; j++) {
            if (a[vertex][j] != 0) count++;
        }
        System.out.println(count);
    }
}
