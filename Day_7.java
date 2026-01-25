import java.util.Scanner;

public class Day_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("*** Conditional Statements in Java ***");
        System.out.println();
// *******************************************************************


        System.out.println("1. if / else Statement");
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is zero or negative.");
        }

        System.out.println();

//**************************************************************

        System.out.println("2. Multiple if Statements");
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Eligible to vote.");
        }
        if (age >= 21) {
            System.out.println("Eligible to drive.");
        }
        if (age >= 25) {
            System.out.println("Eligible for government job.");
        }

        System.out.println();

//*******************************************************************

        System.out.println("3. if-else Ladder");
        System.out.println("Enter marks (0 - 100):");
        int marks = sc.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A");
        }
        else if (marks <= 89 && marks >= 75) {
            System.out.println("Grade: B");
        }
        else if (marks <= 74 && marks >= 50) {
            System.out.println("Grade: C");
        }
        else if (marks <= 49 && marks >= 20) {
            System.out.println("Grade: D");
        }
        else if (marks <= 19 && marks >= 0){
            System.out.println("Grade: E");
        }
        else {
            System.out.println("Invalid marks entered!");
        }

        System.out.println();



//*******************************************************************

        System.out.println("4. Dangling else Example");
        System.out.println("Enter a number:");
        int x = sc.nextInt();

        if (x > 0)
            if (x % 2 == 0)
                System.out.println("Positive Even Number");
            else
                System.out.println("Odd Number");
        // else is attached to (x % 2 == 0), NOT (x > 0)

        System.out.println();

//**************************************************************************


        System.out.println("5. switch-case Statement");
        System.out.println("Enter a day number (1 - 7):");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number!");
        }

        System.out.println();



//***************************************************************************

        System.out.println("6. Ternary Operator");
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is " + result);

        System.out.println();
        System.out.println("THANK YOU");

        sc.close();
    }
}
