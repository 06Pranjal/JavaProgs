package JavaProgs.Leetcode;

class Q171 {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char c = columnTitle.charAt(i);
            int value = c - 'A' + 1; // Convert letter to corresponding value (A=1, B=2, ..., Z=26)
            result = result * 26 + value; // Accumulate the result
        }
        return result;
    }

    public static void main(String[] args) {
        Q171 solution = new Q171();
        System.out.println(solution.titleToNumber("ZY"));  // Output: 701
        System.out.println(solution.titleToNumber
                ("A"));   // Output: 1
        System.out.println(solution.titleToNumber("AB"));  // Output: 28
    }
}

