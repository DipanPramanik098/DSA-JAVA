import java.util.HashMap;

public class _14_findItiniraryFromTickets {

    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> revMap = new HashMap<>();

        // Build reverse mapping: destination -> source
        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }

        // Find the starting point (source not present as any destination)
        for (String key : tickets.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;
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
        System.out.println("Itinerary:");

        while (start != null) {
            System.out.print(start);
            start = tickets.get(start);
            if (start != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }
}
