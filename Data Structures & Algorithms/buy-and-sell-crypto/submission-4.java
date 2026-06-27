class Solution {
    public int maxProfit(int[] prices) {
        // int cur  = 0;
        int max  = 0;
        int buyPoint = 0;//curMin
        int sellPoint = 0;//curTraversal
        while(sellPoint<prices.length){
            if(prices[sellPoint]<=prices[buyPoint]){
                buyPoint = sellPoint;
            }else{
                max = Math.max(prices[sellPoint] - prices[buyPoint],max);

            }
            sellPoint++;
        }
        return max;
        
    }
}
