import java.util.Scanner;

public class Day_19 {
    public static void main(String[] args) {

	System.out.print(" Smart Billing Systems ");


        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter item price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        // Calculate total bill
        double totalBill = price * quantity;
        double discount = 0;

        // Apply discount using nested if-else
        if (totalBill >= 5000) {
            discount = totalBill * 0.10;   // 10% discount
        } else if (totalBill >= 2000) {
            discount = totalBill * 0.05;   // 5% discount
        }

        // Bill after discount
        double discountedAmount = totalBill - discount;

        // Add 18% GST
        double gst = discountedAmount * 0.18;
        double finalAmount = discountedAmount + gst;

        // Display results
        System.out.println("\n----- BILL DETAILS -----");
        System.out.println("Total Bill: " + totalBill);
        System.out.println("Discount: " + discount);
        System.out.println("GST (18%): " + gst);
        System.out.println("Final Payable Amount: " + finalAmount);

        sc.close();
    }
}
