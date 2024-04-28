package homework_week3_maninisheth;

//Write a Java program to calculate the average value of array elements.
public class Program19 {
    public static void main(String[] args) {
       //single array
        int[] array = {1, 2, 3, 4, 5};
        double average = calculateAverage(array);
        System.out.println("Average of the array: " + average);
    }

    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
}
