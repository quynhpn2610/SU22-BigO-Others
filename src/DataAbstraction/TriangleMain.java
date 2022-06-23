package DataAbstraction;

import java.util.*;

class Point2D{
    // Attributes
    int x, y;

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Constructors
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point2D(){
        this.x = 0;
        this.y = 0;
    }

    // Method to calc the distance between 2 points
    double distance(Point2D a){
        double distanceX = (x-a.x)*(x-a.x);
        double distanceY = (y-a.y)*(y-a.y);
        return Math.sqrt(distanceX + distanceY);
    }

    // toString
    @Override
    public String toString(){
        return String.format("%d %d", this.x, this.y);
    }

}

class Triangle{
    // Attributes
    Point2D A, B, C;

    // Constructors
    public Triangle(Point2D X, Point2D Y, Point2D Z){
        this.A = X;
        this.B = Y;
        this.C = Z;
    }

    // Method to calc area
    double calcArea(){
        double a = B.distance(C);
        double b = A.distance(C);
        double c = A.distance(B);
        double s = (a+b+c)/2;
        double S = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return S;
    }

    // toString
    @Override
    public String toString(){
        return String.format("%d %d \n%d %d \n%d %d", A, B, C);
    }
}



public class TriangleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Triangle t;
        Point2D A, B, C;
        int x, y;
        double total = 0;
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            A = new Point2D(x, y);

            x = sc.nextInt();
            y = sc.nextInt();
            B = new Point2D(x, y);

            x = sc.nextInt();
            y = sc.nextInt();
            C = new Point2D(x, y);

            t = new Triangle(A, B, C);

            total += t.calcArea();
        }

        System.out.printf("%.2f", total);

        sc.close();
    }
}
