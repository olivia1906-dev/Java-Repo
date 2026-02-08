import java.util.Scanner;

public class Day_22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Determine sign
        String sign;
        if (number > 0) {
            sign = "Positive";
        } else if (number < 0) {
            sign = "Negative";
        } else {
            sign = "Zero (neither positive nor negative)";
        }

        // Determine even or odd
        boolean isEven = (number % 2 == 0);

        // Check divisibility by both 5 and 7
        boolean divisibleBy5And7 = (number % 5 == 0 && number % 7 == 0);

        // Output results
        System.out.println("\n--- Number Classification Result ---");
        System.out.println("Number: " + number);
        System.out.println("Sign: " + sign);
        System.out.println("Even/Odd: " + (isEven ? "Even" : "Odd"));
        System.out.println("Divisible by both 5 and 7: " + (divisibleBy5And7 ? "Yes" : "No"));

        sc.close();
    }
}
