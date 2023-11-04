public class evenele {
    public static void main(String[] args) {
        // Initializing an array
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Printing elements at even positions
        System.out.println("Elements at even positions are:");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                System.out.print(arr[i] + " ");

            }
        }
    }}
