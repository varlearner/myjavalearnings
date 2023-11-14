package src.com.learnjava;



import java.util.Scanner;

//Program to find one missing number in an Array and print it.
public class MissingNumberInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0, j = 1; i < size; i++, j++) {
            System.out.println("Enter number " + j + ": ");
            arr[i] = sc.nextInt();
        }

        int arrSum = 0;
        for(int i = 0; i < arr.length; i++) {
           arrSum = arrSum + arr[i];
        }

        int smallest = getSmallestNumber(arr);
        int biggest = getBiggestNumber(arr);

        if(biggest-smallest == arr.length) {
            int totalSum = getSumOfNNumbers(size + 1, smallest, biggest);

            //System.out.println(totalSum);

            System.out.println("Missing number is: " + (totalSum - arrSum));
        }

        else {
            System.out.println("No missing number in array !!");
        }

    }

    // arr[4,7,6,3,2,8,5,10]
    public static int getSmallestNumber(int[] arr) {

        int smallest = arr[0];

        for(int i=0 ; i< arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static int getBiggestNumber(int[] arr) {

        int biggest = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] > biggest){
                biggest = arr[i];
            }
        }
        return biggest;
    }

    //(n(a+l))/2
    public static int getSumOfNNumbers(int numberOfElements, int firstElement, int lastElement){
        return (numberOfElements * (firstElement + lastElement)) / 2;
    }
}