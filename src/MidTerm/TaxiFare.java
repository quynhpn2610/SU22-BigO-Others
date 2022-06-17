package MidTerm;

import java.util.Scanner;

public class TaxiFare {
    private static int fareCalc(int n){
        int fare = 15000;
        if (n == 1){
            return fare;
        }
        else if (n >= 2 && n <= 5){
            fare += 13500*(n-1);
        }
        else if (n >= 6 && n<12){
            fare += 13500*4 + 11000*(n-5);
        }
        else{
            fare += 13500*4 + 11000*(n-5);
            fare *= 0.9;
        }
        return fare;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(fareCalc(n));
        sc.close();
    }
}
