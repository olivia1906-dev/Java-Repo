import java.util.Scanner;

public class Day_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("*** Arrays in Java ***");
        System.out.println();

        // ---------------- 1D Array ----------------
        // Used to store multiple values of same data type
        System.out.println("1. One-Dimensional Array");

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n]; // array declaration

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();   // modifying array elements
        }

        System.out.println("Elements of the array are:");
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]); // accessing elements
        }

        System.out.println();

        // Modify an array element
        System.out.println("Modifying array element at index 0");
        arr[0] = arr[0] + 10;
        System.out.println("Updated value of arr[0] = " + arr[0]);

        System.out.println();

        // ---------------- 2D Array ----------------
        // Used to store data in rows and columns (table form)
        System.out.println("2. Two-Dimensional Array");

        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns:");
        int cols = sc.nextInt();

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
            System.out.println(); // next row
        }

        sc.close();
        System.out.println();
        System.out.println("THANK YOU");
    }
}
