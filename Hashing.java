import java.util.*;
public class Hashing {
    public static void main(String args[]) {
      // Creating 
      HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
      
        // Size 
        System.out.println("Size of set: " + set.size());

        // Print All Elements 
        System.out.println("Elements in the set:");
        for (Integer element : set) {
            System.out.println(element);
        }
         // Iterator 
         Iterator it = set.iterator();
        System.out.println("Using Iterator:");
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
  
        // Searching 
        if(set.contains(1)){
            System.out.println("Set contains 1");
        }
        if(!set.contains(4)){
            System.out.println("Set does not contain 4");
        }

        // Deleting 
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("Set does not contain 1 after deletion");
        }
    }
}
