import java.util.*;
public class TwoDarray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][] numbers = new int[rows][cols];

        // input 
        for(int i=0; i<rows; i++){
            // columns
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

       int x = sc.nextInt();

       for(int i =0; i<rows; i++){
        for(int j=0; j<cols; j++){
            // compare with X 
            if(numbers[i][j] == x){
                System.out.println("x found at location (" + i + ", " + j + ")");
        }
       }
    }
}
} 