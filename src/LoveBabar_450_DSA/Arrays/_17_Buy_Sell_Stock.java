package LoveBabar_450_DSA.Arrays;

public class _17_Buy_Sell_Stock {
    public static void main(String args[])
    {
        int prices[] = { 7, 1, 5, 6, 4 };
        int n = prices.length;
        int max_profit = maxProfit(prices, n);
        System.out.println(max_profit);
    }    static int maxProfit(int prices[], int n)
    {
        int buy = prices[0], max_profit = 0;
        for (int i = 1; i < n; i++) {

            // Checking for lower buy value
            if (buy > prices[i])
                buy = prices[i];

                // Checking for higher profit
            else if (prices[i] - buy > max_profit)
                max_profit = prices[i] - buy;
        }
        return max_profit;
    }

}
/*
Time Complexity: O(N). Where N is the size of prices array.
Auxiliary Space: O(1)
 */
