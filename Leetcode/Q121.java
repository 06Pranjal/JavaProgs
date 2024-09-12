package JavaProgs.Leetcode;

class Q121 {
    public int maxProfit(int[] prices) {
        int maxProfit=0,min=prices[0];
        if (prices == null || prices.length < 2) {
            return 0;
        }
        for(int i =0;i<prices.length;i++)
        {
            if(prices[i]<min)
            {
                min=prices[i];
            }
            int profit=prices[i]-min;
            if(profit>maxProfit)
            {
                maxProfit=profit;
            }
        }
        return maxProfit;


    }
    public static void main(String args[])
    {
        int prices[]={7,1,5,3,6,4};
        Q121 ob=new Q121();
        System.out.println(ob.maxProfit(prices));

    }
}
