// Implementation of Stack class Using Java Collection Framework 
import java.util.Stack;
public class StackClass2 {
    
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop(); 
        }
    }
}
