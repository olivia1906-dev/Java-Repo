public class Day_12 {

    public static void main(String[] args) {


           //PATTERN 1: SOLID RECTANGLE (4 x 5)


        System.out.println("Pattern 1: Solid Rectangle (Stars)");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nPattern 1: Solid Rectangle (Numbers)");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("\nPattern 1: Solid Rectangle (Alphabets)");
        for (int i = 1; i <= 4; i++) {
            char ch = 'A';
            for (int j = 1; j <= 5; j++) {
                System.out.print(ch++);
            }
            System.out.println();
        }


           //PATTERN 2: LEFT HALF PYRAMID

        System.out.println("\nPattern 2: Left Half Pyramid (Stars)");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nPattern 2: Left Half Pyramid (Numbers)");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("\nPattern 2: Left Half Pyramid (Alphabets)");
        for (int i = 1; i <= 4; i++) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++);
            }
            System.out.println();
        }


           //PATTERN 3: RIGHT ALIGNED HALF PYRAMID


        System.out.println("\nPattern 3: Right Aligned Half Pyramid (Stars)");
        for (int i = 1; i <= 4; i++) {
            for (int s = 4 - i; s > 0; s--) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }

        System.out.println("\nPattern 3: Right Aligned Half Pyramid (Numbers)");
        for (int i = 1; i <= 4; i++) {
            for (int s = 4 - i; s > 0; s--) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print(j);
            System.out.println();
        }

        System.out.println("\nPattern 3: Right Aligned Half Pyramid (Alphabets)");
        for (int i = 1; i <= 4; i++) {
            for (int s = 4 - i; s > 0; s--) System.out.print(" ");
            char ch = 'A';
            for (int j = 1; j <= i; j++) System.out.print(ch++);
            System.out.println();
        }


           //PATTERN 4: PYRAMID


        System.out.println("\nPattern 4: Pyramid (Stars)");
        for (int i = 1; i <= 3; i++) {
            for (int s = 3 - i; s > 0; s--) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }

        System.out.println("\nPattern 4: Pyramid (Numbers)");
        for (int i = 1; i <= 3; i++) {
            for (int s = 3 - i; s > 0; s--) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print(i);
            System.out.println();
        }

        System.out.println("\nPattern 4: Pyramid (Alphabets)");
        for (int i = 1; i <= 3; i++) {
            for (int s = 3 - i; s > 0; s--) System.out.print(" ");
            char ch = (char) ('A' + i - 1);
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print(ch);
            System.out.println();
        }

        //PATTERN 5: INVERTED HALF PYRAMID

        System.out.println("\nPattern 5: Inverted Half Pyramid (Stars)");
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }

        System.out.println("\nPattern 5: Inverted Half Pyramid (Numbers)");
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print(j);
            System.out.println();
        }

        System.out.println("\nPattern 5: Inverted Half Pyramid (Alphabets)");
        for (int i = 4; i >= 1; i--) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) System.out.print(ch++);
            System.out.println();
        }


          // PATTERN 6: DIAMOND



        System.out.println("\nPattern 6: Diamond (Stars)");
        int n = 3;

        for (int i = 1; i <= n; i++) {
            for (int s = n - i; s > 0; s--) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int s = n - i; s > 0; s--) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }

        System.out.println("\n--- ALL PATTERNS PRINTED SUCCESSFULLY ---");
    }
}
