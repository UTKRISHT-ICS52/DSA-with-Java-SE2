public class Recursion8 {
    public static int countPaths(int i,int j, int n, int m){
        if(i == n || j == m) {
            return 0; 
        }
        if(i == n-1 && j == m-1) {
            return 1;
        }
        // move douwnwards
        int downPaths = countPaths(i+1, j,n,m);
        // move right 
        int rightPaths = countPaths(i, j+1, n, m);
        return downPaths + rightPaths;
    }
    public static void main(String arg[]){
        int n = 3; 
        int m = 3; 
        int totalPath =countPaths(0,0,n,m);
        System.out.println(totalPath);

    }
}
