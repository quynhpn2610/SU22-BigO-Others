package Review;

import java.util.Scanner;

public class PalindromeCheck {
    private static boolean isPalR(String str, int s, int e){
        // if str has only 1 char
        if (s==e) return true;
        // if str has 2 chars
        if (str.charAt(s) != str.charAt(e)) return false;
        // if str has more than 2 chars, check if middle substring is also palindrome
        if (s<e+1){
            return isPalR(str, s+1, e-1);
        }
        return true;
    }

    private static boolean isPalindrome(String str, int n){
        n = str.length();
        if (n==0) return true;
        return isPalR(str, 0, n-1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String str = sc.next();

        if (isPalindrome(str, n)) System.out.println("YES");
        else System.out.println("NO");

    }

}
