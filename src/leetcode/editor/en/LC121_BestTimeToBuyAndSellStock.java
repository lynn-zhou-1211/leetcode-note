package src.leetcode.editor.en;

public class LC121_BestTimeToBuyAndSellStock{
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxProfit(int[] prices) {
            // greedy
//            int minPrice = Integer.MAX_VALUE;
//            int maxProfit = 0;
//
//            for (int price : prices) {
//                if (price < minPrice) {
//                    minPrice = price;
//                } else if (price - minPrice > maxProfit) {
//                    maxProfit = price - minPrice;
//                }
//            }
//            return maxProfit;

            // dp
            // dp[i][0]: 持有股票   max{dp[i-1][0],      -prices[i]}
            //                       昨天就有     昨天没有，今天刚买（一定没有交易过，手里的钱是0）
            // dp[i][1]: 不持有股票 max{dp[i-1][1], dp[i-1][0]+prices[i]}
            //                       昨天就没有        昨天有，今天卖掉了

            int n = prices.length;
            int[][] dp = new int[n][2];
            dp[0][0]=-prices[0];
            dp[0][1]=0;
            for (int i = 1; i <n; i++) {
                dp[i][0]=Math.max(dp[i-1][0],-prices[i]);
                dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]+prices[i]);
            }
            return dp[n-1][1];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
