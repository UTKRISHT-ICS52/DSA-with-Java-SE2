public class Recursion9 {
    public static int placeTiles(int n ,int m) {
        if(n == m) {
            return 2; 
        }
        if(n < m) {
            return 1; 
        }
        // place tile vertically
        int verticalTiles = placeTiles(n - m, m);
        // place tile horizontally
        int horizontalTiles = placeTiles(n - 1, m);
        return verticalTiles + horizontalTiles;
    }
    public static void main(String arg[]){
        int n = 4; // floor size
        int m = 2; // tile size
        int totalWays = placeTiles(n , m);
        System.out.println(totalWays);
    }
}
