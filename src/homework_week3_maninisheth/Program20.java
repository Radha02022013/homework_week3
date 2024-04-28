package homework_week3_maninisheth;

// Write a Java program to test if an array contains a specific value.
public class Program20 {
    public static void main(String[] args) {
        //array
        int[] array = {1, 2, 3, 4, 5};
        int targetValue = 3;

        boolean containsValue = contains(array, targetValue);

        if (containsValue) {
            System.out.println("The array contains the value " + targetValue);
        } else {
            System.out.println("The array does not contain the value " + targetValue);
        }
    }

    public static boolean contains(int[] array, int targetValue) {
        for (int num : array) {
            if (num == targetValue) {
                return true;
            }
        }
        return false;
    }
}
