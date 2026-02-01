import java.util.Scanner;

public class Day_15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("*** Student Marks Analysis ***");
        System.out.println();

        // Ask number of subjects
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        int total = 0;
        int max, min;

        // Take marks input
        System.out.println("Enter marks for each subject:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        // Initialize max and min
        max = marks[0];
        min = marks[0];

        // Find highest and lowest marks
        for (int i = 1; i < n; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
            if (marks[i] < min) {
                min = marks[i];
            }
        }

        double average = (double) total / n;

        // Display results
        System.out.println();
        System.out.println("----- Result -----");
        System.out.println("Total Marks   : " + total);
        System.out.println("Average Marks : " + average);
        System.out.println("Highest Marks : " + max);
        System.out.println("Lowest Marks  : " + min);

        sc.close();
    }
}
