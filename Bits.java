public class Bits {
    public static void main(String args[]){
        // Get Bit at position 2
      int n = 5;
      int pos = 2;
      int bitMask =1<<pos;
      if((bitMask & n) ==0){
            System.out.println("bit was Zero");
      }
        else {
             System.out.println("bit was one");
        }
      }
    }
