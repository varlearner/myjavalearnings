package src.com.learnjava;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter size" );
        int size = scanner.nextInt();
        int[] arr1 = new int[size];

        for (int i=0, j=1; i<size ; i++, j++) {
            System.out.println("Enter number " + j + ": " );
            arr1[i] = scanner.nextInt();
        }

        Arrays.sort(arr1);

        if(arr1.length == 0) {
            System.out.println("array is empty");
            return;
        }

        if(arr1.length == 1) {
            System.out.println(arr1[0]);
            return;
        }

        int[] finalArr = new int[arr1.length];

        finalArr[0] = arr1[0];

        int j=1, currNum = arr1[0];

        for ( int i = 0; i < arr1.length; i++) {

            if (currNum != arr1[i]) {
                finalArr[j] = arr1[i];
                j++;
            }
            currNum = arr1[i];
        }
        for (int i = 0; i < j; i++) {
            System.out.println(finalArr[i]);
        }
    }
}
