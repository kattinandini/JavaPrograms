public class largestele {
    public static void main(String[] args) {
        // Initializing an array
        int[] myArray = {10, 25, 8, 31, 17, 42, 13};

        // Initializing a variable to store the largest element
        int max = myArray[0];

        // Finding the largest element in the array
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }

        // Printing the largest element
        System.out.println("The largest element in the array is: " + max);
    }
}
