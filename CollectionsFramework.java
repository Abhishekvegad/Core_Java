
// Topic: Collections Framework in Java
// Definition: Demonstrates ArrayList, LinkedList, HashMap, and HashSet.
// Use: Helps in handling dynamic data structures.

import java.util.*;

public class CollectionsFramework {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println("ArrayList: " + list);

        // HashSet (No duplicates)
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10); // Duplicate ignored
        System.out.println("HashSet: " + set);

        // HashMap (Key-Value pairs)
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        System.out.println("HashMap: " + map);
    }
}