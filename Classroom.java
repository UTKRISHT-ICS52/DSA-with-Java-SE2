// Majority Element (> n/3) in an Array 
import java.util.HashMap;

public class Classroom {

    // Method to find majority elements (> n/3)
    public static void majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        // Count frequency
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Print elements occurring more than n/3 times
        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                System.out.println(key);
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        int nums[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        majorityElement(nums);
    }
}
