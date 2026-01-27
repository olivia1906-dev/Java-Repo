import java.util.Scanner;

public class Day_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("*** Arrays in Java ***\n");

        // ---------------- 1D Array ----------------
        System.out.println("1. One-Dimensional Array");
        System.out.println("Enter number of elements:");

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements of the array are:");
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        System.out.println();

        // Modify an array element safely
        System.out.println("Modifying array element at index 0");
        arr[0] = arr[0] + 10;
        System.out.println("Updated value of arr[0] = " + arr[0]);

        System.out.println();

        // ---------------- 2D Array ----------------
        System.out.println("2. Two-Dimensional Array");

        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns:");
        int cols = sc.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.out.println("Rows and columns must be greater than 0.");
            sc.close();
            return;
        }

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
        System.out.println("\nTHANK YOU");
    }
}
cl