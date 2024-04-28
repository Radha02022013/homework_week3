package homework_week3_maninisheth;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        System.out.println("Is leap year: " + isLeapYear(year));

        System.out.print("Enter a month: ");
        int month = scanner.nextInt();
        System.out.print("Enter a year: ");
        int yearForMonth = scanner.nextInt();
        System.out.println("Days in the month: " + getDaysInMonth(month, yearForMonth));

        scanner.close();
    }

    public static boolean isLeapYear(int year) {
        // if else condition

        if (year < 1 || year > 9999) {
            return false;
        } else {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        } else {
            // switch statement
            switch (month) {
                case 2:
                    return (isLeapYear(year)) ? 29 : 28;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    return 31;
            }
        }
    }
}