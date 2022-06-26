package DataAbstraction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Employee implements Comparable<Employee>{
    // Attributes
    String id;
    String name;
    int yearOfBirth;

    // Constructor, Getters, Setters

    public Employee(String id, String name, int yearOfBirth) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    // toString
    @Override
    public String toString(){
        return String.format("%s %s %d", this.id, this.name, this.yearOfBirth);
    }

    // this is to sort an Array of Employee
    @Override
    public int compareTo(Employee o) {
        if(this.yearOfBirth == o.yearOfBirth){
            return (Integer.compare(Integer.parseInt(this.id), Integer.parseInt(o.id)));
        }
        return (Integer.compare(this.yearOfBirth, o.yearOfBirth));
    }
}
public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Employee e;
        Employee[] eArr = new Employee[n];
        for (int i = 0; i < n; i++) {
            String id = sc.next();
            String name = sc.next();
            int yearOfBirth = sc.nextInt();
            e = new Employee(id, name, yearOfBirth);
            eArr[i] = e;
        }

        Arrays.sort(eArr);
        System.out.println(eArr[0]);

        sc.close();
    }

}
