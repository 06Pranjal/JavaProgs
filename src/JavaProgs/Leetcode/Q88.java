package JavaProgs.Leetcode;

class Q88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Indexes for the last elements in nums1 and nums2
        int i = m - 1; // Last index of initialized elements in nums1
        int j = n - 1; // Last index of nums2
        int k = m + n - 1; // Last index of nums1 where the merged result will be stored

        // Merge in reverse order
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // Copy any remaining elements from nums2 (if any)
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

        // Print the merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Q88 ob = new Q88();
        ob.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
    }
}
