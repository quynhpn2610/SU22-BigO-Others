package MidTerm;

import java.util.Scanner;

public class Domino {
    private static int groupNum(String[] arr){
        int count = 1;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i].toCharArray()[1] == arr[i+1].toCharArray()[0]){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }
        System.out.println(groupNum(arr));
        sc.close();
    }
}
