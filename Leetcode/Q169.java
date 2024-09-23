package JavaProgs.Leetcode;
class Q169 {
    public int majorityElement(int[] nums) {
        int m = nums[0], v = 1;

        // First pass: Find candidate for majority element
        for (int i = 1; i < nums.length; i++) {
            if (v == 0) {
                m = nums[i];
                v = 1;
            } else if (m == nums[i]) {
                v++;
            } else {
                v--;
            }
        }

        // Second pass: Verify if the candidate is actually the majority element
        int count = 0;
        for (int num : nums) {
            if (num == m) {
                count++;
            }
        }

        // Return the candidate, as the problem assumes that the input always has a majority element
        return m;
    }

    public static void main(String[] args) {
        Q169 ob = new Q169();
        System.out.println(ob.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
        System.out.println(ob.majorityElement(new int[]{6, 5, 5}));
    }
}

