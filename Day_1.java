public class Day_1 {
    public static void main(String[] args) {
        System.out.println("Basic calculator perfroming basic operations like additon, subtraction, multiplication and division.") //using arithmetic operators
        // Using literals (fixed values)
        int num1 = 25;
        int num2 = 5;

        // Performing calculations
        int addition = num1 + num2; // to find addition of two numbers
        int subtraction = num1 - num2; // to find subtraction of two numbers
        int multiplication = num1 * num2; // to find multipliication of two numbers
        int division = num1 / num2; // to find division of two numbers
        int modulo = num1 % num2 ; // to find modulus of two numbers

        // Displaying results
        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);

        System.out.println("Addition = " + addition);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division = " + division);
        System.out.println("Modulus = " + modulo)
    }
}
