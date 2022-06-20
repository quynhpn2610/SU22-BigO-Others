package CodeForce;

import java.util.Scanner;

public class CubePyramid2 {
    private static int countLevel(int n) {
        return count(1, 1, n);
    }

    private static int count(int level, int cubeUsed, int n) {
        if (cubeUsed >= n) {
            return level;
        }
        else {
            int cubeUsedAtThisLevel = cubeUsed + level + 1;
            return count(level + 1, cubeUsed + cubeUsedAtThisLevel, n);
        }
    }

    // Given the number of cubes, calculate the max number of floors possible
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countLevel(n));
        sc.close();

    }

}


/*** Given the number of floors, calculate the number of cubes
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
 int count = 0;
 for (int i = 1; i <= n; i++) {
 count += ((1+i)*i)/2;
 }
 System.out.println(count);

 sc.close();
 }
 ***/
