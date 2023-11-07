package src.com.learnjava;

import java.util.Scanner;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = sc.nextInt();

        for( int x = 1; x < num; x++) {
            if(x%2 ==0) {
                System.out.print(x + " ");
            }

        }
        System.out.println();
        for(int x=1; x < num; x++) {
            if(x%2 != 0) {
                System.out.print(x + " ");

            }
        }
    }

}
