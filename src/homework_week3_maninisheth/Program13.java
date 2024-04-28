package homework_week3_maninisheth;

import java.util.Scanner;

/**
 * Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
public class Program13 {
    public static void main(String[] args) {
        // scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 7: ");
        int dayNumber = scanner.nextInt();
// string
        String dayName;

        switch (dayNumber) {
            case 1:
                dayName = "MONDAY";
                break;
            case 2:
                dayName = "TUESDAY";
                break;
            case 3:
                dayName = "WEDNESDAY";
                break;
            case 4:
                dayName = "THURSDAY";
                break;
            case 5:
                dayName = "FRIDAY";
                break;
            case 6:
                dayName = "SATURDAY";
                break;
            case 7:
                dayName = "SUNDAY";
                break;
            default:
                dayName = "Invalid";
                break;
        }

        if (dayName.equals("Invalid")) {
            System.out.println("Week contains 1 to 7 days");
        } else {
            System.out.println("The day of the week is: " + dayName);
        }

        scanner.close();
    }

}
