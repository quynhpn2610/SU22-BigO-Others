package DataAbstraction;
import java.util.*;

class Point {
    // Attributes
    private int x, y;

    // Getters

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Constructors
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(){
        this.x = 0;
        this.y = 0;
    }


    // Methods
    double distanceCalc(Point a){
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

public class PointMain{
    public static void main(String[] args) {
        // Get input
        Scanner sc = new Scanner(System.in);
        int x0 = sc.nextInt();
        int y0 = sc.nextInt();
        Point p = new Point(x0, y0);
        int n = sc.nextInt();
        int x, y;
        Point[] arr = new Point[n];
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            arr[i] = new Point(x, y);
        }

        // Calculate the max distance
        double max = 0;
        Point maxP = new Point();
        for (int i = 0; i < n; i++) {
            if(p.distanceCalc(arr[i]) > max){
                max = p.distanceCalc(arr[i]);
                maxP = new Point(arr[i].getX(), arr[i].getY());
            }
        }
        System.out.println(maxP.toString());

    }
}