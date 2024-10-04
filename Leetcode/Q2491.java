package JavaProgs.Leetcode;

import java.util.Arrays;

class Q2491 {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);  // Sort the skill array first
        long totalScore = 0;
        int n = skill.length;

        int targetSum = skill[0] + skill[n - 1];  // The sum of the first and last element

        for (int i = 0; i < n / 2; i++) {
            int player1 = skill[i];  // Get the player with the lowest skill
            int player2 = skill[n - 1 - i];  // Get the player with the highest skill

            // If the sum of this pair doesn't match the target sum, return -1 (invalid pairing)
            if (player1 + player2 != targetSum) {
                return -1;
            }

            // Perform some operation (like multiplying the skills)
            totalScore += (long) player1 * player2;
        }

        return totalScore;
    }
}
Q2491
