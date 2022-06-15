package Strings;

import java.util.*;

public class LeastExistingChar {
    private static char leastExisting(String s){
        s = s.toUpperCase();
        char[] sArr = s.toCharArray();
        Map<Character, Integer> sMap = new HashMap<>();
        List<Character> minExisting = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < sArr.length; i++) {
            if (sMap.containsKey(sArr[i])){
                sMap.put(sArr[i], sMap.get(sArr[i])+1);

            }
            else{
                sMap.put(sArr[i], 1);
            }
        }
        for (char ch: sMap.keySet()) {
            if (sMap.get(ch) < min){
                min = sMap.get(ch);
            }
        }

        for (char ch: sMap.keySet()) {
            if (sMap.get(ch) == min){
                minExisting.add(ch);
            }
        }
        Collections.sort(minExisting);
        return minExisting.get(0);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            arr[i] = s;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(leastExisting(arr[i]));
        }
        sc.close();
    }
}
