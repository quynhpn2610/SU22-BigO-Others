package DataAbstraction;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Students{
    // Attributes
    int id;
    double[] scores;

    // Constructor
    public Students(int id, double[] scores){
        this.id = id;
        this.scores = scores;
    }

    // toString
    public String toString(){
        return String.format("%d %.1f %.1f", this.id, this.scores[0], this.scores[1]);
    }

}

public class SchoolManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] idArr = new int[q];
        double[] scores;
        HashMap<Integer, double[]> map = new HashMap<>();

        // Input n students
        for (int i = 0; i < n; i++) {
            int id = Integer.parseInt(sc.next());
            scores = new double[2];
            for (int j = 0; j < 2; j++) {
                scores[j] = Double.parseDouble(sc.next());
            }
            // Students s = new Students(id, scores);
            map.put(id, scores);
        }

        // input student id and look up
        for (int i = 0; i < q; i++) {
            int id = Integer.parseInt(sc.nextLine());
            idArr[i] = id;
        }

        for (int i = 0; i < idArr.length; i++) {
            if (map.containsKey(idArr[i])) System.out.println(Arrays.toString(map.get(idArr[i])));
        }
    }
}
