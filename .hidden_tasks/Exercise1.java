public class Exercise1 {
    
    // Method to find the minimum and maximum value in an array
    public static int[] findMinMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }

        int min = array[0];
        int max = array[0];

        for (int number : array) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        return new int[]{min, max};
    }
    
    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 6};
        int[] result = findMinMax(numbers);
        System.out.println("Min: " + result[0] + ", Max: " + result[1]);
    }
}