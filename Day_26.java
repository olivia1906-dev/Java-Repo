import java.util.Scanner;

public class Day_26 {

    // Bitwise addition (no + operator)
    public static int add(int x, int y) {
        while (y != 0) {
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        return x;
    }

    public static int multiply(int a, int b) {
        boolean negative = false;

        // Handle sign
        if (a < 0) {
            a = add(~a, 1); // Two's complement to make positive
            negative = !negative;
        }
        if (b < 0) {
            b = add(~b, 1);
            negative = !negative;
        }

        int result = 0;

        while (b > 0) {
            if ((b & 1) == 1) {
                result = add(result, a);
            }
            a <<= 1;
            b >>= 1;
        }

        // Apply sign if needed
        if (negative) {
            result = add(~result, 1);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int product = multiply(a, b);
        System.out.println("Product: " + product);
    }
}
