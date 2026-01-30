import java.util.Scanner;

public class Day_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("*** Sum and Average of Array Elements ***");
        System.out.println();

        // Step 1: Take size of array
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];   // Array declaration
        int sum = 0;              // Variable to store sum

        // Step 2: Take array elements from user
        System.out.println("Enter " + n + " integer elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];  // Add each element to sum
        }

        // Step 3: Calculate average
        double average = (double) sum / n;

        // Step 4: Display results
        System.out.println();
        System.out.println("Sum of array elements = " + sum);
        System.out.println("Average of array elements = " + average);

        sc.close();
        System.out.println();
        System.out.println("THANK YOU");
    }
}
