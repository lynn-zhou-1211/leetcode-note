package src.leetcode.editor.en;

public class LC714_BestTimeToBuyAndSellStockWithTransactionFee {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxProfit(int[] prices, int fee) {
            // dp[i][0]：持有  昨天就持有    今天刚买入
            //              dp[i-1][0]    dp[i-1][1]-price
            // dp[i][1]:不持有 昨天没有     今天刚卖掉（不确定是哪一天买的）
            //              dp[i-1][1]    dp[j-1][0]+price

            int n = prices.length;
            int[][] dp = new int[n][2];

            dp[0][0] = -prices[0];
            dp[0][1] = 0;
            for (int i = 1; i < n; i++) {
                dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] - prices[i]);
                dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + prices[i] - fee);
            }
            return dp[n - 1][1];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
