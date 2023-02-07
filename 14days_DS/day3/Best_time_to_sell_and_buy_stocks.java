//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//you want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
// Example 1:
//
//        Input: prices = [7,1,5,3,6,4]
//        Output: 5
//        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
//        Example 2:
//
//        Input: prices = [7,6,4,3,1]
//        Output: 0
//        Explanation: In this case, no transactions are done and the max profit = 0.

class Solution {
    public int maxProfit(int[] prices) {
        //첫날은 무조건 산다고 생각
        //오늘 팔면 이윤이 증가하면 오늘 팔았다고 치고 이윤 업데이트
        //산 가격보다 싼 가격 나오면 산 가격 변경

        //step1 : set buy price for day 0's price

        int buyPrice = prices[0];
        int profit =0;

        for(int i=1; i<prices.length; i++){
            if(buyPrice > prices[i]){ // if today's value is cheaper than the day I buy stocks
                buyPrice = prices[i]; // change buy price.
            }

            if(profit < prices[i]-buyPrice){ // if it is better to sell today, sell today
                profit = prices[i]-buyPrice;
            }
        }

        return profit;

    }
}