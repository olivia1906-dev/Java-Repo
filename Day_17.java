import java.util.Scanner;

public class Day_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Element to search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        // Linear Search
        int position = -1; // default = not found

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                position = i;
                break; // stop searching once found
            }
        }

        // Output result
        if (position != -1) {
            System.out.println("Element found at index: " + position);
            System.out.println("Position (human counting): " + (position + 1));
        } else {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}
