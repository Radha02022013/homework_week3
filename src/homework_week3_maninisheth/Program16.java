package homework_week3_maninisheth;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Program16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The entered number is POSITIVE.");
        } else if (number < 0) {
            System.out.println("The entered number is NEGATIVE.");
        } else {
            System.out.println("The entered number is ZERO.");
        }

        scanner.close();
    }

}
