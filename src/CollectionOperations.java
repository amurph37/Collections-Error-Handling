import java.util.*;

public class CollectionOperations {

    public static void main(String[] args) {
        // Define a list of integers with duplicates
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        try {
            // Use a set to remove duplicates
            Set<Integer> uniqueNumbers = new HashSet<>(numbers);

            // Calculate the sum and average
            int sum = calculateSum(uniqueNumbers);
            double average = calculateAverage(uniqueNumbers);

            // Print the results
            System.out.println("List of integers without duplicates: " + uniqueNumbers);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);

        } catch (IllegalArgumentException | ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Operation completed.");
        }
    }

    private static int calculateSum(Set<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("The collection cannot be null or empty.");
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    private static double calculateAverage(Set<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("The collection cannot be null or empty.");
        }

        int sum = calculateSum(numbers);
        return (double) sum / numbers.size(); // May throw ArithmeticException if size is zero
    }
}
