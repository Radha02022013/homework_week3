package homework_week3_maninisheth;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Program8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input alphabet
        System.out.print("Enter an alphabet (A to F): ");
        char alphabet = scanner.next().toUpperCase().charAt(0); // Convert to uppercase to handle lowercase inputs

        // Determine city name based on the alphabet
        String cityName;
        if (alphabet == 'A') {
            cityName = "Bangalore";
        } else if (alphabet == 'B') {
            cityName = "Ahmedabad";
        } else if (alphabet == 'C') {
            cityName = "Cochin";
        } else if (alphabet == 'D') {
            cityName = "Kerala";
        } else if (alphabet == 'E') {
            cityName = "Surat";
        } else if (alphabet == 'F') {
            cityName = "Mumbai";
        } else {
            cityName = null; // Set cityName to null for invalid entries
        }

        // Print city name or "Invalid entry"
        if (cityName != null) {
            System.out.println("City corresponding to " + alphabet + ": " + cityName);
        } else {
            System.out.println("Invalid entry.");
        }
    }
}
