public class Recursion5 {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int indx, char element) {
        if(indx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(indx); 
        if(currChar == element) {
            if(first == -1) {
                first = indx; // First occurrence
            } else {
            last = indx; // Last occurrence
        }
    }

        findOccurance(str, indx + 1, element); // Recursive call
    }
    public static void main(String[] args) {
        String str = "Code";
        findOccurance(str, 0, 'a');
    }
}

