import java.util.Scanner;

public class Day_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("*** Sum and Average of Array Elements ***\n");

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];   // adding elements to sum
        }

        double average = (double) sum / n;

        System.out.println("\nArray elements:");
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        System.out.println("\nSum of elements = " + sum);
        System.out.println("Average of elements = " + average);

        sc.close();
        System.out.println("\nTHANK YOU");
    }
}
