package SinglyLinkedList;

import com.sun.tools.hat.internal.util.Comparer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindNewDate {
    static class MyDate implements Comparable<MyDate> {
        int day;
        int month;
        int year;

        public MyDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        @Override
        public String toString(){
            return String.format("%d %d %d", day, month, year);
        }

        @Override
        public int compareTo(MyDate o) {
            if(this.year == o.year){
                if (this.month == o.month){
                    return Integer.compare(this.day, o.day);
                }
                return (Integer.compare(this.month, o.month));
            }
            return Integer.compare(this.year, o.year);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<MyDate> dates = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int day = Integer.parseInt(sc.next());
            int month = Integer.parseInt(sc.next());
            int year = Integer.parseInt(sc.next());
            MyDate myDate = new MyDate(day, month, year);
            dates.add(myDate);
        }
        Collections.sort(dates);
        System.out.println(dates.get(dates.size()-1));
        sc.close();
    }
}
