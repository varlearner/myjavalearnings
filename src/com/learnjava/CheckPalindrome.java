package src.com.learnjava;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String pali = sc.next();

        boolean isPalindrome = true;
        int left = 0;
        int right = pali.length()-1;

        while(left < right) {
            if(pali.charAt(left) != pali.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if(isPalindrome) {
            System.out.println("The string is a palindrome.");
        }
        else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
