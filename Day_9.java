public class Day_9 {
    public static void main(String[] args) {

        System.out.println("*** Loops in Java ***");
        System.out.println();

        // ---------------- for loop ----------------
        // Used when the number of iterations is known
        System.out.println("1. for loop (Print numbers from 1 to 5):");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println();

        // ---------------- while loop ----------------
        // Condition is checked before executing the loop
        System.out.println("2. while loop (Print numbers from 1 to 5):");

        int j = 1;
        while (j <= 5) {
            System.out.println("j = " + j);
            j++;
        }

        System.out.println();

        // ---------------- do-while loop ----------------
        // Executes at least once, even if condition is false
        System.out.println("3. do-while loop (Executes at least once):");

        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 5);

        System.out.println();

        // ---------------- break statement ----------------
        // Used to exit the loop completely
        System.out.println("4. break statement:");

        for (int x = 1; x <= 10; x++) {
            if (x == 6) {
                break; // loop stops when x becomes 6
            }
            System.out.println("x = " + x);
        }

        System.out.println();

        // ---------------- continue statement ----------------
        // Used to skip the current iteration
        System.out.println("5. continue statement:");

        for (int y = 1; y <= 5; y++) {
            if (y == 3) {
                continue; // skips when y is 3
            }
            System.out.println("y = " + y);
        }

        System.out.println();

        // ---------------- nested loop ----------------
        // Loop inside another loop
        System.out.println("6. Nested loop (Pattern printing):");

        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print("* ");
            }
            System.out.println(); // move to next line
        }

        System.out.println();
        System.out.println("THANK YOU");
    }
}
