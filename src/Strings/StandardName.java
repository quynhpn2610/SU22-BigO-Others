package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class StandardName {
    private static String standardName(String name){
        StringBuilder res = new StringBuilder("");
        name = name.trim();
        char[] nameArr = name.toCharArray();
        for (int i = 0; i < nameArr.length; i++) {
            if (i==0 || nameArr[i-1] == ' '){ //
                if (nameArr[i] >= 'a' && nameArr[i] <= 'z'){
                    nameArr[i] = (char)(nameArr[i]-32); // to upper case
                }
            }
            else{
                if (nameArr[i] >= 'A' && nameArr[i] <= 'Z'){
                    nameArr[i] = (char)(nameArr[i]+32);
                }
            }
            res.append(nameArr[i]);
        }
        return (res.toString());
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
            System.out.println(standardName(arr[i]));
        }
        sc.close();
    }
}
