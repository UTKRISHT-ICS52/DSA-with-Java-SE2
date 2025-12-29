import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // get elements
        int element = list.get(1);
        System.out.println(element);

        // add elements in between 
        list.add(1,5);
        System.out.println(list);

        // set Elements 
        list.set(0,5);
        System.out.println(list);

        // delete elements 
        list.remove(3);
        System.out.println(list);

        // size 
        int size = list.size();
        System.out.println(size);

        // loops 
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println();

        // Sorting 
        Collections.sort(list);
        System.out.println(list);
    }
}
