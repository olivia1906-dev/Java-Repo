import java.util.Scanner;

public class Day_21 {

    // Constants for percentage rates
    private static final double HRA_HIGH = 0.20;
    private static final double DA_HIGH = 0.15;
    private static final double HRA_LOW = 0.10;
    private static final double DA_LOW = 0.08;
    private static final double PF_RATE = 0.12;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        // Input validation
        if (basicSalary < 0) {
            System.out.println("Salary cannot be negative.");
            sc.close();
            return;
        }

        double hra, da;

        // Conditional HRA & DA calculation
        if (basicSalary >= 30000) {
            hra = basicSalary * HRA_HIGH;
            da = basicSalary * DA_HIGH;
        } else {
            hra = basicSalary * HRA_LOW;
            da = basicSalary * DA_LOW;
        }

        // PF Deduction
        double pf = basicSalary * PF_RATE;

        // Net Salary Calculation
        double netSalary = basicSalary + hra + da - pf;

        // Output
        System.out.println("\n----- Salary Breakdown -----");
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("HRA          : " + hra);
        System.out.println("DA           : " + da);
        System.out.println("PF Deduction : " + pf);
        System.out.println("----------------------------");
        System.out.println("Net Salary   : " + netSalary);

        sc.close();
    }
}
