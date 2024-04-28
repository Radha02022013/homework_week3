package homework_week3_maninisheth;

import java.util.Scanner;

//Write a program that tells us input value is number or an alphabet or symbol.
public class Program12 {
    public static void main(String[] args) {
        //Declare scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char input = scanner.next().charAt(0);
// if else statement
        if (Character.isDigit(input)) {
            System.out.println("Input is a number.");
        } else if (Character.isLetter(input)) {
            System.out.println("Input is an alphabet.");
        } else {
            System.out.println("Input is a symbol.");
        }

        scanner.close();
    }
}
