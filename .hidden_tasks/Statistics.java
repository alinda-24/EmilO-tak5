public class Statistics {
    
    // Method to calculate mean of an array
    public static double mean(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }

        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        return sum / numbers.length;
    }

    // Method to calculate median of an array
    public static double median(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }

        Arrays.sort(numbers);
        int middle = numbers.length / 2;

        if (numbers.length % 2 == 0) {
            return (numbers[middle - 1] + numbers[middle]) / 2.0;
        } else {
            return numbers[middle];
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7};
        System.out.println("Mean: " + mean(numbers));
        System.out.println("Median: " + median(numbers));
    }
}