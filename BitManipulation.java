public class BitManipulation {
    public static void main(String[] args) {
        int n = 10;  // 1010

        int i = 1;  // position

        // Get bit
        int getBit = (n >> i) & 1;
        System.out.println("Get bit: " + getBit);

        // Set bit
        int setBit = n | (1 << i);
        System.out.println("Set bit: " + setBit);

        // Clear bit
        int clearBit = n & ~(1 << i);
        System.out.println("Clear bit: " + clearBit);

        // Toggle bit
        int toggleBit = n ^ (1 << i);
        System.out.println("Toggle bit: " + toggleBit);
    }
}
