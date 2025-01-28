class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0; // Handle the edge case when the prices array is empty
        }

        // Initialize minPrice to the first element and maxProfit to 0
        int minPrice = prices[0];
        int maxProfit = 0;

        // Iterate over the prices starting from the second element
        for (int i = 1; i < prices.length; i++) {
            // Update minPrice if the current price is lower
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                // Calculate profit if selling at the current price
                int profit = prices[i] - minPrice;
                // Update maxProfit if this profit is greater
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        
        return maxProfit;
    }
}
