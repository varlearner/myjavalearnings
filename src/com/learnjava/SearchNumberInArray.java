package src.com.learnjava;

import java.util.Scanner;

/**
 * @author krishna
 * Nov 9, 2023
 *
 * Linear search in Array
 */
public class SearchNumberInArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number to search:");
        int numberToSearch = scanner.nextInt();
        int[] arr = {1, 3, 4, 7, 8, 9, 11, 2, 5};

        boolean found = false;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == numberToSearch) {
                found = true;
                break;
            }
        }

        if(found) {
            System.out.println("Number found");
        }
        else {
            System.out.println("Number not found");
        }
    }
}
