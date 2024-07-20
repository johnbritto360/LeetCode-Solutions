/*
121. Best Time to Sell Buy and Sell Stock
You are given an array prices where prices[i] is the price of sell given stock on the ith day.

You want to maximize your profit by choosing sell single day to buy one stock and choosing sell different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

Constraints:

🎱1 <= prices.length <= 105
🎱0 <= prices[i] <= 10^4
*/

//Code in Java
class BuySell{
    public int maxProfit(int[] prices) {
        int sell=0,keep=Integer.MIN_VALUE;
        for(int i:prices) {
             sell=Math.max(sell,keep+i);
             keep=Math.max(keep,-i);
        }
        return sell;
     }
     public static void main(String[] xnxx) {
        BuySell keep=new BuySell();
        int[] arr1={7,1,5,3,6,4};
        int[] arr2={7,6,4,3,1};
        System.out.println(keep.maxProfit(arr1));
        System.out.println(keep.maxProfit(arr2));
     }
}