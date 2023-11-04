public class secondele {
    public static void main(String[] args) {
        // Initializing an array
        int[] myArray = {5, 2, 8, 12, 7, 3, 9, 10};

        // Finding the second largest element in the array
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : myArray) {
            if (number > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = number;
            } else if (number > secondLargest && number != firstLargest) {
                secondLargest = number;
            }
        }

        // Printing the second largest element
        System.out.println("The second largest element in the array is: " + secondLargest);
    }
}
