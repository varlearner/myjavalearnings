package src.com.learnjava;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String pali = sc.next();

        for (int index = pali.length()- 1; index >= 0; index--) {
            char chars = pali.charAt(index);
            System.out.print(chars);
        }
    }
}
