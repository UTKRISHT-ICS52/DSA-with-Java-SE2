public class star12 {
    public static void main(String[] args){
        int n =4;
        // outer loop
        for(int i=1; i<=n; i++){
            // inner loop
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }

            // star 
            for(int j=1;  j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // lower half 
        for(int i=n; i>=1; i--){
            // inner loop
        for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }

            // star 
            for(int j=1;  j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


