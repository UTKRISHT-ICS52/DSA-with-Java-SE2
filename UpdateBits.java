import java.util.Scanner;
public class UpdateBits {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt(); 
        int n =5; // 0101
        int pos =1;
        
        if(oper ==1){
            // set 
            int bitMask = 1<<pos;
            int newNumber = bitMask |n;
            System.out.println("newNumber: " + newNumber);
        }
        else{
            // clear
            int bitMask = 1<<pos;
            int newNumber = n & ~(bitMask);
            System.out.println("newNumber: " + newNumber);
        }
    }
}
