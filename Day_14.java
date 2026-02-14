import java.util.Scanner;

public class Day_14{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Ask user for array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Step 2: Declare array
        int[] arr = new int[n];

        // Step 3: Take array input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 4: Initialize max and min with first element
        int max = arr[0];
        int min = arr[0];

        // Step 5: Traverse array to find max and min
        for (int i = 1; i < n; i++) {

            // If current element is greater than max
            if (arr[i] > max) {
                max = arr[i];
            }

            // If current element is smaller than min
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Step 6: Display results
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);

        sc.close();
    }
}
