import java.util.Scanner;

public class ReverseDigitAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int original = num;
        num = Math.abs(num);   // Handle negative numbers safely

        int reverse = 0, sum = 0, count = 0;

        while (num > 0) {
            int digit = num % 10;     // Get last digit
            reverse = reverse * 10 + digit; // Build reversed number
            sum += digit;             // Add digit to sum
            count++;                  // Increase digit count
            num /= 10;                // Remove last digit
        }

        // If original number was negative, keep reverse negative too
        if (original < 0) {
            reverse = -reverse;
        }

        System.out.println("Original Number: " + original);
        System.out.println("Reverse: " + reverse);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Number of digits: " + count);

        sc.close();
    }
}
