package DataAbstraction;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Students{
    // Attributes
    String id;
    double[] scores;

    // Constructor
    public Students(String id, double[] scores){
        this.id = id;
        this.scores = scores;
    }

    // toString
    public String toString(){
        return String.format("%s %.1f %.1f", this.id, this.scores[0], this.scores[1]);
    }

}

public class SchoolManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String[] idArr = new String[q];
        double[] scores;
        HashMap<String, double[]> map = new HashMap<>();

        // Input n students
        for (int i = 0; i < n; i++) {
            String id = sc.next();
            scores = new double[2];
            for (int j = 0; j < 2; j++) {
                scores[j] = Double.parseDouble(sc.next());
            }
            // Students s = new Students(id, scores);
            map.put(id, scores);
        }

        // input student id and look up
        for (int i = 0; i < q; i++) {
            String id = sc.next();
            idArr[i] = id;
        }

        for (int i = 0; i < idArr.length; i++) {
            if (map.containsKey(idArr[i])){
                for (int j = 0; j < map.get(idArr[i]).length; j++) {
                    System.out.print(map.get(idArr[i])[j] + " ");
                }
            }
            System.out.println();
        }
    }
}
