package Trees;

import java.util.Scanner;

public class HighestGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StudentTree tree = new StudentTree();
        for (int i = 0; i < n; i++) {
            String id = sc.next();
            String name = sc.next();
            Double grade = Double.parseDouble(sc.next());
            Student s = new Student(id, name, grade);
            tree.addToStudentTree(s);
        }
        System.out.println(tree.maxStudentTreeGrade());
        sc.close();
    }
}
