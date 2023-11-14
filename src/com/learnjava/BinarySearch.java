package src.com.learnjava;

import java.util.Scanner;

//Program to implement binary search
public class BinarySearch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number to search:");
        int numberToSearch = scanner.nextInt();
        int[] arr = {1, 3, 4, 7, 8, 9, 11, 2, 5};

        boolean found = false;

        for (int index = 0, j = arr.length - 1; index <= j; index++, j--) {
            if (arr[index] == numberToSearch) {
                found = true;
                break;
            }
            if(arr[j] == numberToSearch){
                found = true;
                break;
            }
        }

        if(found) {
            System.out.println("number is found");
        }
        else {
            System.out.println("number not found");
        }
    }
}