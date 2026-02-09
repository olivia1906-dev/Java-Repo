import java.util.Scanner;

public class Day_24 {

    // Rate constants
    private static final double RATE_FIRST_100 = 2.0;
    private static final double RATE_NEXT_100 = 3.0;
    private static final double RATE_ABOVE_200 = 5.0;
    private static final double FIXED_CHARGE = 150.0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        // Input validation
        if (units < 0) {
            System.out.println("Units consumed cannot be negative.");
            sc.close();
            return;
        }

        double energyCharge;

        if (units <= 100) {
            energyCharge = units * RATE_FIRST_100;
        } 
        else if (units <= 200) {
            energyCharge = (100 * RATE_FIRST_100) +
                           (units - 100) * RATE_NEXT_100;
        } 
        else {
            energyCharge = (100 * RATE_FIRST_100) +
                           (100 * RATE_NEXT_100) +
                           (units - 200) * RATE_ABOVE_200;
        }

        double totalBill = energyCharge + FIXED_CHARGE;

        // Output breakdown
        System.out.println("\n----- Electricity Bill Breakdown -----");
        System.out.println("Units Consumed     : " + units);
        System.out.println("Energy Charge      : ₹" + energyCharge);
        System.out.println("Fixed Meter Charge : ₹" + FIXED_CHARGE);
        System.out.println("--------------------------------------");
        System.out.println("Total Bill Amount  : ₹" + totalBill);

        sc.close();
    }
}
