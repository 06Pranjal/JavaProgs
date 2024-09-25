class Q349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] tempArr = new int[Math.min(nums1.length, nums2.length)];
        int c = 0;

        for (int i = 0; i < nums1.length; i++) {
            boolean alreadyAdded = false;

            for (int k = 0; k < c; k++) {
                if (tempArr[k] == nums1[i]) {
                    alreadyAdded = true;
                    break;
                }
            }

            if (!alreadyAdded) {
                for (int j = 0; j < nums2.length; j++) {
                    if (nums1[i] == nums2[j]) {
                        tempArr[c] = nums1[i];
                        c++;
                        break;
                    }
                }
            }
        }

        int[] result = new int[c];
        for (int i = 0; i < c; i++) {
            result[i] = tempArr[i];
        }

        return result;
    }

    public static void main(String args[]) {
        Q349 ob = new Q349();
        int[] result = ob.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
