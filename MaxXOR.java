class MaxXOR {
    static class Node {
        Node zero, one;
    }
    static Node root = new Node();

    // Insert number into Trie
    static void insert(int num) {
        Node curr = root;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (bit == 0) {
                if (curr.zero == null) curr.zero = new Node();
                curr = curr.zero;
            } else {
                if (curr.one == null) curr.one = new Node();
                curr = curr.one;
            }
        }
    }

    // Find maximum XOR for a number
    static int getMaxXor(int num) {
        Node curr = root;
        int maxXor = 0;

        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;

            // Opposite bit preferred
            if (bit == 0 && curr.one != null) {
                maxXor |= (1 << i);
                curr = curr.one;
            } else if (bit == 1 && curr.zero != null) {
                maxXor |= (1 << i);
                curr = curr.zero;
            } else {
                curr = (bit == 0) ? curr.zero : curr.one;
            }
        }
        return maxXor;
    }

    // Main function
    public static int findMaximumXOR(int[] nums) {

        // Insert all numbers
        for (int num : nums) {
            insert(num);
        }

        int max = 0;
        for (int num : nums) {
            max = Math.max(max, getMaxXor(num));
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {3, 10, 5, 25, 2, 8};
        System.out.println(findMaximumXOR(nums)); // 28
    }
}
