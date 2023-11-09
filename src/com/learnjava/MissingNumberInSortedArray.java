package src.com.learnjava;

import java.util.Scanner;

/**
 * @author Varsha
 * Nov 9, 2023
 */
public class MissingNumberInSortedArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i=0, j=1; i<size ; i++, j++) {
            System.out.println("Enter number " + j + ": " );
            arr[i] = sc.nextInt();
        }
        if(arr[0] != 1) {
            System.out.println("Missing number is : 1");
            return;
        }

        for(int i= 0; i < size-1; i++) {

            if (arr[i+1]- arr[i] != 1) {
                System.out.println("Missing number is :" + (arr[i]+1));
                break;
            }
          System.out.println(arr[i]);// to check where the for loop is ending
        }

    }
}
