public class duplicates {
    public static void main(String[] args) {
        // Initializing an array
        int[] myArray = {1, 2, 3, 2, 4, 1, 3, 5, 2, 4};

        // Printing duplicate elements
        System.out.println("Duplicate elements in the array are:");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]) {
                    System.out.println(myArray[j]);
                    break;
                }
            }
        }
    }
}
