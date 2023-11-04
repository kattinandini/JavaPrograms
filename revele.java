public class revele {
    public static void main(String[] args) {
        // Initializing an array
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Printing the array in reverse order
        System.out.println("Array elements in reverse order:");
        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }
    }
}
