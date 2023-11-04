import java. util.*;
public class asendingele {
    public static void main(String[] args) {
        // Initializing an array
        int[] myArray = {10, 5, 8, 3, 7, 1, 6, 2, 4, 9};

        // Sorting the array in ascending order
        Arrays.sort(myArray);

        // Printing the array in ascending order
        System.out.println("Array elements in ascending order:");
        for (int i : myArray) {
            System.out.print(i + " ");
        }
    }
}
