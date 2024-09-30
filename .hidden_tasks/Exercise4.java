import java.util.List;
import java.util.ArrayList;

public class Exercise4 {
    
    // Method to find intersection of an ArrayList and an array
    public static ArrayList<Integer> intersectCollections(ArrayList<Integer> list, int[] array) {
        ArrayList<Integer> intersection = new ArrayList<>();
        if (list == null || array == null) {
            throw new IllegalArgumentException("Collection and array must not be null.");
        }

        for (int number : array) {
            if (list.contains(number)) {
                intersection.add(number);
            }
        }
        
        return intersection;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);

        int[] array = {2, 4, 3, 5};

        ArrayList<Integer> intersection = intersectCollections(list, array);
        System.out.println("Intersection: " + intersection);
    }
}