package homework_week3_maninisheth;

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Input arithmetic symbol
        System.out.print("Enter an arithmetic symbol (+, -, *, /): ");
        char symbol = scanner.next().charAt(0);

        // Perform arithmetic operation based on the symbol using if-else
        double result;
        if (symbol == '+') {
            result = num1 + num2;
        } else if (symbol == '-') {
            result = num1 - num2;
        } else if (symbol == '*') {
            result = num1 * num2;
        } else if (symbol == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero!");
                return; // Exit the program if division by zero occurs
            }
        } else {
            System.out.println("Invalid arithmetic symbol!");
            return; // Exit the program for invalid symbol
        }

        // Print the result
        System.out.println("Result of " + num1 + " " + symbol + " " + num2 + " = " + result);
    }
}
