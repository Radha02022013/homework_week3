package homework_week3_maninisheth;

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input alphabet
        System.out.print("Enter an alphabet (A to F): ");
        char alphabet = scanner.next().toUpperCase().charAt(0); // Convert to uppercase to handle lowercase inputs

        // Determine city name based on the alphabet using switch statement
        String cityName;
        switch (alphabet) {
            case 'A':
                cityName = "Bangalore";
                break;
            case 'B':
                cityName = "Ahmedabad";
                break;
            case 'C':
                cityName = "Cochin";
                break;
            case 'D':
                cityName = "Kerala";
                break;
            case 'E':
                cityName = "Surat";
                break;
            case 'F':
                cityName = "Mumbai";
                break;
            default:
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
