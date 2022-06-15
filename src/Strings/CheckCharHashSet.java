//package Strings;
//
//import java.util.HashSet;
//import java.util.Scanner;
//
//public class CheckCharHashSet {
//    private static boolean checkChar(String s){
//        boolean hasBIGO = false;
//        char[] alphabet = new char[26];
//        for (char c = 'a'; c <= 'z'; c++) {
//            alphabet[c - 'a'] = c;
//        }
//
//        Set<Character> set = new HashSet<>();
//        for (char c : alphabet) {
//            ((HashSet<?>) set).add(c);
//            ((HashSet<?>) set).add(Character.toUpperCase(c));
//        }
//
//        if (((HashSet<?>) set).contains('b', 'i', 'o', 'g')){
//            return true;
//        }
//
//
//        return hasBIGO;
//    }
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//
//        if (checkChar(s)) System.out.println("YES");
//        else System.out.println("NO");
//        sc.close();
//    }
//}
