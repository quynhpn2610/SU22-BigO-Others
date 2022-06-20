package CodeForce;

import java.util.Scanner;

public class CubePyramid {
    private static int countLevel(int cubeNum){
        int level = 0;
        for (int i = 1; i <= cubeNum; i++) {
            if (cubeNum<((1+i)*i/2)) return level;
            cubeNum -= ((1+i)*i)/2;
            level++;
        }
        return level;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countLevel(n));
        sc.close();

    }
}
