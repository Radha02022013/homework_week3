package homework_week3_maninisheth;

/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */
public class Program11 {

    public static void main(String[] args) {

        System.out.println("Numbers divisible by 3:\tNumbers divisible by 5:");
        printNumbersDivisibleBy3And5();
    }

    public static void printNumbersDivisibleBy3And5()
// if statement
    {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + "\t");
            }
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}




