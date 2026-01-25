import java.util.Scanner;
public class Day_8{
    public static void main(String[] args){

        System.out.println("*** Basic Calculator *** \nOperations you can perform : \n1. Addition \n2. Subtraction \n3. Division \n4. Multiplication ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integers to perform operations on : ");
        int num1 = sc.nextInt(), num2 = sc.nextInt();

        System.out.println("Enter operation number to perform on : (1 - 4) ");
        int op = sc.nextInt();

        System.out.println("Integers entered are : " + num1 + " and " + num2);

        if(op < 1 || op > 4) {
            System.out.println("Invalid operation number!");
            sc.close();
            return;
        }

        String operationName = switch(op) {
            case 1 -> "Addition";
            case 2 -> "Subtraction";
            case 3 -> "Division";
            case 4 -> "Multiplication";
            default -> "";
        };

        int result = switch(op) {
            case 1 -> num1 + num2;
            case 2 -> num1 - num2;
            case 3 -> num1 / num2;
            case 4 -> num1 * num2;
            default -> 0;
        };

        System.out.println("Operation to be performed is : " + operationName + "\nThe " + operationName + " of " + num1 + " and " + num2 + " is " + result);
        sc.close();
    }
}
