import java.util.Scanner;

public class TaxCalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Annual Income: ");
        double income = scanner.nextDouble();

        double taxAmount = calculateTax(income);

        System.out.println("Tax Amount: " + taxAmount);

        scanner.close();
    }

    public static double calculateTax(double income) {
        double taxAmount = 0;

        if (income <= 350000.00) {
            taxAmount = 0;
        } else if (income > 350000.00 && income <= 450000.00) {
            taxAmount = (income - 350000.00) * (5.0 / 100);
        } else if (income > 450000.00 && income <= 750000.00) {
            taxAmount = 5000.00 + (income - 450000.00) * (10.0 / 100);
        } else if (income > 750000.00 && income <= 1150000.00) {
            taxAmount = 5000.00 + 30000.00 + (income - 750000.00) * (15.0 / 100);
        } else if (income > 1150000.00 && income <= 1650000.00) {
            taxAmount = 5000.00 + 30000.00 + 60000.00 + (income - 1150000.00) * (20.0 / 100);
        } else {
            taxAmount = 5000.00 + 30000.00 + 60000.00 + 40000.00 + (income - 1650000.00) * (25.0 / 100);
        }

        return taxAmount;
    }
}
