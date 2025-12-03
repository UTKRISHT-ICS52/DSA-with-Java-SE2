public class Recursion4 {
    public static void towerOfHanoi(int n, String src, String helper, String dest){
    if(n==1){
        System.out.println("Move disk 1 from " + src + " to " + dest);
        return;
    }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Move disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n-1, helper, src, dest);
        
    }

    public static void main(String[] args) {
        int n = 1; // Number of disks
        towerOfHanoi(n, "A", "B", "C"); // A, B and C are names of rods
}
        

