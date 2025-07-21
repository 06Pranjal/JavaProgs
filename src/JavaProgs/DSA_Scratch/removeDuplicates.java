package JavaProgs.DSA_Scratch;

import java.util.*;

public class removeDuplicates {
    public static int[] RemoveDuplicates(int[] arr) {
        Set<Integer> seen = new LinkedHashSet<>(); // maintains order
        for (int num : arr) {
            seen.add(num); // HashSet automatically removes duplicates
        }

        // Convert set back to array
        int[] result = new int[seen.size()];
        int i = 0;
        for (int num : seen) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1,2,2,2,3,5,6,6,7};
        int[] unique = RemoveDuplicates(arr);

        System.out.println("Array after removing duplicates:");
        System.out.println(Arrays.toString(unique));
    }
}
