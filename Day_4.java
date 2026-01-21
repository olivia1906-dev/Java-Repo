import java.util.Scanner;
public class Day_4{
    public static void main(String[] args){

        System.out.println("*** Basic Calculator *** ");
        System.out.println("Operations you can perform : ");
        System.out.println("1. Addition ");
        System.out.println("2. Subtraction ");
        System.out.println("3. Division ");
        System.out.println("4. Multiplication ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integers to perform operations on : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Enter operation number to perform on : (1 - 4) ");
        int op = sc.nextInt();

        System.out.println("Integers entered are :  " + num1 + " and " + num2);

        String operationName = "";
        int result = 0;

        if(op == 1) {
            operationName = "Addition";
            result = num1 + num2;
        }
        else if(op == 2) {
            operationName = "Subtraction";
            result = num1 - num2;
        }
        else if(op == 3) {
            operationName = "Division";
            result = num1 / num2;
        }
        else if(op == 4) {
            operationName = "Multiplication";
            result = num1 * num2;
        }
        else {
            System.out.println("Invalid operation number!");
            return;
        }

        System.out.println("Operation to be performed is : " + operationName);
        System.out.println("The " + operationName + " of " + num1 + " and " + num2 + " is " + result);

        sc.close();
    }
}