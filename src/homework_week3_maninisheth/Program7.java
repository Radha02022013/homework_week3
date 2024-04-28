package homework_week3_maninisheth;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 *     Sales amount >= 50,000 35%
 *     Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class Program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sales details
        System.out.print("Enter sales ID: ");
        int salesId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter seller's name: ");
        String sellerName = scanner.nextLine();
        System.out.print("Enter sales amount: ");
        double salesAmount = scanner.nextDouble();
        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate sales commission
        double commissionRate;
        if (salesAmount >= 50000) {
            commissionRate = 0.35;
        } else if (salesAmount >= 30000) {
            commissionRate = 0.20;
        } else if (salesAmount >= 20000) {
            commissionRate = 0.10;
        } else if (salesAmount >= 10000) {
            commissionRate = 0.05;
        } else {
            commissionRate = 0.02;
        }

        double commission = commissionRate * salesAmount;

        // Print sales commission
        System.out.println("Sales commission for " + sellerName + " (Sales ID: " + salesId + "): £" + commission);
    }

}
