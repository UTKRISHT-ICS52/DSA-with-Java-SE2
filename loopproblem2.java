import java.util.Scanner;

public class loopproblem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        for(int i = 1; i<11; i++){
            System.out.println(n*i);
        }
    }
}
