public class Recursion6 {
    public static boolean isSorted(int arr[], int indx) {
        
        if(indx == arr.length - 1 || arr.length == 0) {
            return true;
        }
        
        if(arr[indx] > arr[indx + 1]) {
            return false; // Array is not sorted
        }
        // Recursive call to check the next pair of elements
        return isSorted(arr, indx + 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 7, 3, 4, 5};
        System.out.println(isSorted(arr, 0)); 
    }
}

