import java.util.Scanner;

public class Day_6 {
    public static void main(String[] args) {

        System.out.println("*** Reading and Printing Array Elements ***");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        // Asking user for array size
        System.out.println("Enter the number of elements in the array:");
        int size = sc.nextInt();

        // Creating the array
        int[] arr = new int[size];

        // Reading elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println();

        // Printing elements
        System.out.println("Elements of the array are:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element at index " + i + " is: " + arr[i]);
        }

        sc.close();
    }
}
