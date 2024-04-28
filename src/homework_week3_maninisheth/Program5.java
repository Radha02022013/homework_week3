package homework_week3_maninisheth;

import java.util.Scanner;

/**
 *
 * 5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 *     HRA = basic salary 10%
 *     DA = Basic salary 8%
 *     TA = Basic salary 9%
 *     PF= Basic salary 20%
 *     Gross salary = basic salary + HRA + TA + DA –PF
 */
public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input employee details
        System.out.println("Enter employee ID:");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.println("Enter employee name:");
        String employeeName = scanner.nextLine();
        System.out.println("Enter basic salary:");
        double basicSalary = scanner.nextDouble();
        // Calculate allowances and deductions
        double hra = 0.1 * basicSalary;
        double ta = 0.08 * basicSalary;
        double da = 0.09 * basicSalary;
        double pf = 0.2 * basicSalary;
        // Calculate gross salary
        double grossSalary = basicSalary + hra + ta + da - pf;
        // Print salary slip
        System.out.println("_______________________________");
        System.out.println("|   Salary Slip                 |");
        System.out.println("|______________________________|");
        System.out.println("| Employee Id  : " + employeeId + "          |");
        System.out.println("| Employee Name : " + employeeName + "         |");
        System.out.println("|______________________________|");
        System.out.println("| Basic Salary  : " + basicSalary + "     |");
        System.out.println("| HRA  10%  : " + hra + "         |");
        System.out.println("| TA   8%  : " + ta + "         |");
        System.out.println("| DA   9%  : " + da + "         |");
        System.out.println("| PF - 20%  : " + pf + "         |");
        System.out.println("|______________________________|");
        System.out.println("| Gross Salary  : " + grossSalary + "     |");
        System.out.println("|===========================|");
    }
    }

