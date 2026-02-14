import java.util.Scanner;

public class Day_29 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of late days: ");
        int days = sc.nextInt();

        int fine = 0;

        if (days <= 0) {
            fine = 0;
        }
        else if (days <= 5) {
            fine = days * 2;
        }
        else if (days <= 10) {
            fine = (5 * 2) + (days - 5) * 5;
        }
        else {
            fine = (5 * 2) + (5 * 5) + (days - 10) * 10;
        }

        System.out.println("Total Fine: ₹" + fine);

        sc.close();
    }
}
