package src.leetcode.editor.en;

public class LC518_CoinChangeIi {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int change(int amount, int[] coins) {
            // dp[i]: 可以实现的种类，=sum(dp[i-coin]);
            int[] dp = new int[amount + 1];
            dp[0] = 1;

            // 求组合：先物品再背包，否则会重复，e.g.1+2，2+1
            // 完全背包：正序，选过的可以重新选
            for (int coin : coins) {
                for (int i = 1; i <= amount; i++) {
                    if (i >= coin) dp[i] += dp[i - coin];
                }
            }
            return dp[amount];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
