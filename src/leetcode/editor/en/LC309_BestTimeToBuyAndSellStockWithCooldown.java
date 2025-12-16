package src.leetcode.editor.en;

public class LC309_BestTimeToBuyAndSellStockWithCooldown {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxProfit(int[] prices) {
            // dp[i][0]: 今天持有-昨天就持有/昨天没有今天刚买（前提是昨天没有卖，i.e.昨天和前天一样）
            // dp[i][1]: 今天不持有
//            int n = prices.length;
//
//            int[][] dp = new int[n][2];
//
//            dp[0][0] = -prices[0];
//            dp[0][1] = 0;
//
//            for (int i = 1; i < n; i++) {
//                // 判断是否冷却完成
//                if (i >= 2 && dp[i - 1][1] != dp[i - 2][1]) {
//                    dp[i][0] = dp[i - 1][0];
//                } else {
//                    dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] - prices[i]);
//                }
//                dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + prices[i]);
//            }
//            return dp[n - 1][1];

            // 原本的代码试图手动模拟“冷却检测”，这是贪心的思路，而不是动态规划
            // 动态规划的精髓在于直接定义“买入必须基于前天（i-2）的状态”，从而自动满足冷却期的约束
            //
            // 如果 dp[i-1][1] 是昨天刚刚卖出股票得到的钱，根据题意，今天（冷却期）是不能买入的
            // 正确逻辑： 如果今天（第 i 天）买入，说明昨天（i-1）一定没有卖出操作
            //          那么你的资金状态应该追溯到前天（i-2）结束时不持有股票的状态

            int n = prices.length;
            if(n<2) return 0;

            int[][] dp = new int[n][2];
            dp[0][0]= -prices[0];
            dp[0][1]= 0;
            dp[1][0]= Math.max(-prices[0],-prices[1]);
            dp[1][1]= Math.max(0,prices[1]-prices[0]);

            for (int i = 2; i < n; i++) {
                dp[i][0]= Math.max(dp[i-1][0],dp[i-2][1]-prices[i]);
                dp[i][1]= Math.max(dp[i-1][1],dp[i-1][0]+prices[i]);
            }
            return dp[n-1][1];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
