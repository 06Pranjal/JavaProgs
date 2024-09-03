package JavaProgs.SelfProgs;

class wealth {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for(int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for(int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            // Update maxWealth if current sum is greater
            if(sum > maxWealth) {
                maxWealth = sum;
            }
        }

        return maxWealth;
    }

    public static void main(String[] args) {
        wealth ob = new wealth();
        int[][] accounts = {
                {1, 2, 3},
                {3, 4, 1}
        };
        System.out.println(ob.maximumWealth(accounts)); // Expected output: 6
    }
}

