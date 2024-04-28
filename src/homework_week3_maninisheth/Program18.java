package homework_week3_maninisheth;

//Write a Java program to sum values of an array.
public class Program18 {
    public static void main(String[] args) {
        //single array declaration
        int[] array = {1, 2, 3, 4, 5};
        int sum = sumArray(array);
        System.out.println("Sum of the array: " + sum);
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}

