package JavaProgs.DSA_Scratch;

import java.util.*;

public class HashSetVsLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        int[] arr = {31, 1, 22, 13, 4, 8, 91, 5, 14, 27, 99, 2, 11, 65, 9, 6, 44};


        for (int num : arr) {
            hashSet.add(num);
            linkedHashSet.add(num);
        }

        System.out.println("HashSet: " + hashSet);           // Unordered
        System.out.println("LinkedHashSet: " + linkedHashSet); // Ordered
    }
}

