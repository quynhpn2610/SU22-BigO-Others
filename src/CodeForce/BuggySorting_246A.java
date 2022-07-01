package CodeForce;

import java.util.Scanner;

public class BuggySorting_246A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>2){
            for (int i = 2; i <= n; i++) {
                System.out.print(i + " ");
            }
            System.out.println(1);
        }
        else{
            System.out.println(-1);
        }
        sc.close();
    }
}
