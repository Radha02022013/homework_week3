package homework_week3_maninisheth;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Program1 {
    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to test");
        int number = scanner.nextInt();
        scanner.close();

        // Ternary operator to check number
        String result = number % 2 == 0 ? "Even" : "odd";
        System.out.println(number  +  " is "  +  result);


    }

}
