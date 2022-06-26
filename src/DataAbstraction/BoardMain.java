package DataAbstraction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Cell implements Comparable<Cell>{
    int x, y, value;

    public Cell(int x, int y, int value) {
        this.x = x;
        this.y = y;
        this.value = value;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("%d %d", x, y);
    }

    @Override
    public int compareTo(Cell c) {
       return (Integer.compare(this.value, c.value));
    }
}

public class BoardMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt(); // number of non-empty cells
        Cell cell;
        Cell[] arr = new Cell[k];
        List<Cell> chosen = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int val = sc.nextInt();
            cell = new Cell(x, y, val);
            arr[i] = cell;

        }
        int count = 0;

        for (int i = 0; i < k; i++) {
            if(arr[i].getValue() < 0 || arr[i].getValue() == 0){
                continue;
            }
            chosen.add(arr[i]);
            count ++;
        }

        System.out.println(count);
        for (Cell c:
             chosen) {
            System.out.println(c.toString());
        }
    }
}
