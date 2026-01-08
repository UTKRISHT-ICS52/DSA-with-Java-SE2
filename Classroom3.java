import java.util.*;

public class Classroom3 {
    public static String getStart(HashMap<String, String> tickets) {
        HashSet<String> destinations = new HashSet<>();
        for (String dest : tickets.values()) {
            destinations.add(dest);
        }
        for (String source : tickets.keySet()) {
            if (!destinations.contains(source)) {
                return source;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);

        // Print complete journey
        while (tickets.containsKey(start)) {
            System.out.print(start + " -> ");
            start = tickets.get(start);
        }
        System.out.print(start);
    }
}

