package workshop;
import java.util.*;

public class workshop12 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("Nepal", "Kathmandu");
        map.put("India", "Delhi");
        map.put("USA", "Washington");
        map.put("Japan", "Tokyo");
        map.put("France", "Paris");

        for(Map.Entry<String, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        System.out.println("Capital of Nepal: " + map.get("Nepal"));
        System.out.println("Contains Paris? " + map.containsValue("Paris"));
    }
}