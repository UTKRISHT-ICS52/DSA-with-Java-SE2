public class Redixsort {

    // Function to get maximum value
    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max)
                max = value;
        }
        return max;
    }

    // Counting sort based on digit exponent (1, 10, 100...)
    private static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n]; 
        int[] count = new int[10]; 

        // Store count of occurrences
        for (int value : arr) {
            count[(value / exp) % 10]++;
        }

        // Change count[i] so that count[i] contains actual position
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build output array (stable sorting)
        for (int i = n - 1; i >= 0; i--) {
            int index = (arr[i] / exp) % 10;
            output[count[index] - 1] = arr[i];
            count[index]--;
        }

        // Copy to original array
        System.arraycopy(output, 0, arr, 0, n);
    }

    // Main Radix Sort function
    public static void radixSort(int[] arr) {
        int max = getMax(arr);

        // Apply counting sort for every digit
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    // Testing the algorithm
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};

        System.out.println("Original Array:");
        print(arr);

        radixSort(arr);

        System.out.println("\nSorted Array:");
        print(arr);
    }

    private static void print(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
