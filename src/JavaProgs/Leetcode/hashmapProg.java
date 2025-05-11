package JavaProgs.Leetcode;

import java.util.*;

public class hashmapProg {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Adding entries
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        // Accessing a value
        System.out.println("Key 2: " + map.get(2));  // Banana

        // Iterating through the HashMap
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Removing a key
        map.remove(1);

        // Checking if a key or value exists
        System.out.println("Contains key 3? " + map.containsKey(3));
        System.out.println("Contains value 'Mango'? " + map.containsValue("Mango"));
    }
}

