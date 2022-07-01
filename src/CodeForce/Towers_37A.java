/*
Input: Length of array & elements
Output: Frequency of the most frequent element & number of towers built
 */

package CodeForce;

import java.util.HashMap;
import java.util.Scanner;

public class Towers_37A {
    private static void addAndSort(int[] a){
        HashMap<Integer, Integer> map = new HashMap<>();
        // add blocks with length and frequency to the map
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])){
                map.put(a[i], map.get(a[i])+1);
            }
            else{
                map.put(a[i], 1);
            }
        }
        int max = 1;
        for (int length:
             map.keySet()) {
            if (map.get(length) > max){
                max = map.get(length);
            }
        }
        System.out.print(max + " ");
        System.out.println(map.size());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        addAndSort(a);
    }

}
