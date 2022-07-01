package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Score {
    static class Student implements Comparable<Student>{
        int id;
        double score;

        public Student(int id, double score) {
            this.id = id;
            this.score = score;
        }

        @Override
        public String toString(){
            return String.format("%d %1f", id, score);
        }


        @Override
        public int compareTo(Student o) {
            // sap xep id theo thu tu tang dan de lay id nho hon
            if (this.score == o.score){
                return Integer.compare(this.id, o.id);
            }

            // lay score lon hon
            return Double.compare(o.score, this.score);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            int id = Integer.parseInt(sc.next());
            double score = Double.parseDouble(sc.next());
            students[i] = new Student(id, score);
        }
        Arrays.sort(students);
        for (int i = 0; i < k; i++) {
            System.out.println(students[i].id);
        }
        sc.close();
    }
}
