package ro.fasttrackit.unittesting.recursion;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String str = "";
        System.out.println("Enter your string input: ");
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine().toLowerCase();
        boolean result = isPalindrome(str);
        boolean res = isPalindromeBasic(str);
        System.out.println("The result is: " + result);
        System.out.println("The result from basic op is:" + res);
    }

    public static boolean isPalindromeBasic(String str) {
        StringBuilder reverse = new StringBuilder();
        boolean isPalindrome = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }
        if (str.equals(reverse.toString())) {
            isPalindrome = true;
        }
        return isPalindrome;
    }

    public static boolean isPalindrome(String str) {
        // daca string-ul are lungimea 0 sau 1 => call-ul recursiv este oprit
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }
        /*
         * verificam prima si ultima litera
         * daca sunt egale => se cheama functia recursiva pe substring-ul de la indexul 1 si length -1 */
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome(str.substring(1, str.length() - 1));
        }
        // se va executa daca prima si ultima litera nu sunt egale
        return false;
    }
}
