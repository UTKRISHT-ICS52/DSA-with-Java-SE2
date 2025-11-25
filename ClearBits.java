public class ClearBits {
    public static void main(String[] args){
        int n =5; // 0101
        int pos =2;
        int bitMask = 1<<pos;
        int newNumber = n & ~(bitMask);
        System.out.println("newNumber: " + newNumber);
    }
}

