package MidTerm;

import java.util.Scanner;

public class ValidEmail {
    private static boolean isValidEmail(String s){
        // get rid of spaces at beginning and end
        s = s.trim();

        // Split local and domain
        String[] sArr = s.split("@");
        if (sArr.length != 2) return false; // make sure s has only 1 @

        // check if either local or domain is null
        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i].length() == 0){
                return false;
            }
        }

        // Check if local part contains only 'A' - 'Z', 'a' - 'z', '0' - '9' and special characters: '.' and '_'.
        for (char ch:
             sArr[0].toCharArray()) {
            if (!((int) ch >= 65 && (int) ch <= 90) && !((int) ch >= 97 && (int) ch <= 122) && !((int) ch >= 48 && (int) ch <= 57) && ((int) ch !=95) && ch != '.'){
                return false;
            }
        }

        // Check domain
        char[] sArr1 = sArr[1].toCharArray();

            // check if two consecutive dots or only 1 dots
        int count = 0;
        for (int i = 0; i < sArr1.length-1; i++){
            if (sArr1[i] == '.'){
                count++;
            }
            if (sArr1[i] == '.' && sArr1[i+1] == '.'){
                return false;
            }
        }
        if (sArr1[sArr1.length-1] == '.'){
            count++;
        }
        if (count==0) return false;


            // check if other characters is valid
        for (char ch:
             sArr1) {
            boolean isNotDot = (ch != '.');
            boolean isNotLowercase = !((int) ch >= 65 && (int) ch <= 90);
            boolean isNotUppercase = !((int) ch >= 97 && (int) ch <= 122);
            if (isNotDot && isNotLowercase && isNotUppercase){
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (isValidEmail(s)){
            System.out.println("VALID");
        }
        else {
            System.out.println("INVALID");
        }
        sc.close();
    }
}
