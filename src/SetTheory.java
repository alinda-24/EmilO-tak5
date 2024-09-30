import java.util.ArrayList;

public class SetTheory {
    public static ArrayList<Integer> generateSet(int min, int max) {
        // Initialize an empty ArrayList
        ArrayList<Integer> resultSet = new ArrayList<>();

        // Edge case: if min >= max, return an empty ArrayList
        if (min >= max) {
            return resultSet;
        }

        // Ensure that the maximum value does not exceed 99
        if (max > 99) {
            max = 99;
        }

        // Generate the range and add elements to the ArrayList
        for (int i = min; i < max; i++) {
            resultSet.add(i);
        }

        return resultSet;
    }

    public static void main(String[] args) {

    }
}
