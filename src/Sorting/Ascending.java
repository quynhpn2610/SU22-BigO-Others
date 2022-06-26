package Sorting;

public class Ascending {
    public static int[] ascInsertionSort(int[] a){
        int x = a[1];
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j-1] < x){
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {

    }
}
