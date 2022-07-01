package Sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenOdd {
    private static void sort(int[] arr){
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        List<Integer> oddIndex = new ArrayList<>();
        List<Integer> evenIndex = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                even.add(arr[i]);
                evenIndex.add(i);
            }
            else{
                odd.add(arr[i]);
                oddIndex.add(i);
            }
        }

        selectionSort(even);
        descSelectionSort(odd);
        for (int i = 0; i < oddIndex.size(); i++) {
            arr[oddIndex.get(i)] = odd.get(i);
        }
        for (int i = 0; i < evenIndex.size(); i++) {
            arr[evenIndex.get(i)] = even.get(i);
        }

    }

    private static void selectionSort(List<Integer> a){
        for (int i = 0; i < a.size()-1; i++) {
            int currentMin = a.get(i);
            int minIdx = i;
            for (int j = i+1; j < a.size(); j++) {
                if (a.get(j) < currentMin){
                    currentMin = a.get(j);
                    minIdx = j;
                }
            }
            int temp = a.get(i);
            a.set(i, currentMin);
            a.set(minIdx, temp);
        }
    }

    private static void descSelectionSort(List<Integer> b){
        for (int i = 0; i < b.size()-1; i++) {
            int currentMax = b.get(i);
            int maxInd = i;
            for (int j = i+1; j < b.size(); j++) {
                if (b.get(j) > currentMax){
                    currentMax = b.get(j);
                    maxInd = j;
                }
            }
            int temp = b.get(i);
            b.set(i, currentMax);
            b.set(maxInd, temp);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
