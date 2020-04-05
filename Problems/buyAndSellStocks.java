// buy and sell stocks ii
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/submissions/


class Solution {
    public int maxProfit(int[] prices) {
        int buyPointer = 0;
        int salePointer = 0;
        int sale = buyPointer - salePointer;
        for(int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i+1]) {
                salePointer++;
            }
            else if ((prices[i] >= prices[i+1])) {
                sale += prices[salePointer] - prices[buyPointer];
                buyPointer = i+1;
                salePointer = i+1;
            }
            if (prices[i] < prices[i+1] && ((i+1)==prices.length-1))
                sale = sale + prices[salePointer] - prices[buyPointer];
        }
        return sale;
    }
    /*public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) {
            return 0;
        }
        int profit = 0;
        for(int i = 0; i < prices.length - 1; i++) {
            if(prices[i+1] > prices[i]) {
                profit += prices[i+1] - prices[i];

            }
        }
        return profit;
    }*/
}
