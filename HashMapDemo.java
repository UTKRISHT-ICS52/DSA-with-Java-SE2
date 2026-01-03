import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String args[]) {
    HashMap<String, Integer> map = new HashMap<>();
    // Insertion 
    map.put("India", 120);
    map.put("USA", 60);
    map.put("China", 140);
    System.out.println(map); 
    // Size 
   System.out.println("Size of map: " + map.size());
    // Print All Elements 
   System.out.println("Elements in the map:");
  //  for (String key : map.keySet()) {
     //   System.out.println(key + " -> " + map.get(key));

       // Searching 
  if(map.containsKey("Indonesia")){
      System.out.println("Map contains key Indonesia");
  }
   else{
       System.out.println("Map does not contain key Indonesia");
    }

   System.out.println(map.get("China")); // key exist 
   System.out.println(map.get("Indonesia")); // key does not exist
     
     int arr[]={12,15,18};
        for(int i = 0; i<3; i++){
            System.out.println(arr[i] + " " );
        }
        System.out.println();

        for(int val : arr){
            System.out.println(val + "  "); 
        }
        System.out.println(); 
        
         

         for( Map.Entry<String,Integer>e : map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
         }
        Set<String> keys = map.keySet();
         for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }
    }

}
