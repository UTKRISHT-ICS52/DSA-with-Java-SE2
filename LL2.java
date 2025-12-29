import java.util.LinkedList;
public class LL2 {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addFirst("this");
        list.addLast("List");
        System.out.println(list);
        
    }
}
