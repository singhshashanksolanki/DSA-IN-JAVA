package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapImp {
    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();
        // Insert
        map.put("India", 130);
        map.put("US", 30);
        map.put("Sudan", 10);

        System.out.println(map);

        // Search
        if (map.containsKey("Sudan")) {
            System.out.println("Sudan key exist");
        } else {
            System.out.println("Sudan key does not exist");
        }

        // Get the value using key
        System.out.println(map.get("Sudan"));
        System.out.println(map.get("china"));

        // Iterating the HashMap using for(int val: arr)
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + "=" + map.get(key));
        }

        // Removing the pair of value from HashMap
        map.remove("Sudan");
        System.out.println(map);
    }
}
