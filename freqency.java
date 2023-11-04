public class freqency {
    public static void main(String[] args) {
        // Initializing an array
        int[] myArray = {1, 2, 3, 2, 4, 1, 3, 5, 2, 4};

        // Finding the frequency of each element in the array
        for (int i = 0; i < myArray.length; i++) {
            int frequency = 1;
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]) {
                    frequency++;
                    myArray[j] = 0; // Mark the element as visited
                }
            }
            if (myArray[i] != 0) {
                System.out.println("Element " + myArray[i] + " occurs " + frequency + " times");
            }
        }
    }
}
