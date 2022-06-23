package DataAbstraction;

import java.util.Scanner;

class Student{
    // Attributes
    String name;
    double math, lit;

    // Constructor
    public Student(String name, double math, double lit){
        this.name = name;
        this.math = math;
        this.lit = lit;
    }

    // Getters Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getLit() {
        return lit;
    }

    public void setLit(double lit) {
        this.lit = lit;
    }

    // method
    double GPA(){
        return (this.math+ this.lit)/2;
    }

    // toString
    @Override
    public String toString(){
        return String.format("%s \n%.1f %.1f", name, math, lit);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        // get input
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Student[] sArr = new Student[n];
        String name;
        double math, lit;
        String point;
        String[] points;
        for (int i = 0; i < n; i++) {
            name = sc.nextLine();
            point = sc.nextLine();
            points = point.split(" ");
            math = Double.parseDouble(points[0]);
            lit = Double.parseDouble(points[1]);
            sArr[i] = new Student(name, math, lit);
        }

        // get number of students with high GPA
        int count = 0;
        for (Student s:
             sArr) {
            if(s.GPA() >= 9.0){
                count ++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
