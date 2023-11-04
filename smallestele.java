public class smallestele {
    public static void main(String[] args) {
        // Initializing an array
        int[] myArray = {10, 25, 8, 31, 17, 42, 13};

        // Initializing a variable to store the smallest element
        int min = myArray[0];

        // Finding the smallest element in the array
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < min) {
                min = myArray[i];
            }
        }

        // Printing the smallest element
        System.out.println("The smallest element in the array is: " + min);
    }
}
