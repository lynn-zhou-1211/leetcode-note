package src.leetcode.editor.en;

import java.util.Arrays;

public class LC322_CoinChange {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int coinChange(int[] coins, int amount) {
            int[] dp = new int[amount + 1];
            Arrays.fill(dp, Integer.MAX_VALUE); // 表示凑不出来
            dp[0]=0;
            for (int num : coins) {
                for (int j = num; j <= amount; j++) {
                    if (dp[j-num]!= Integer.MAX_VALUE) dp[j] = Math.min(dp[j], dp[j - num] + 1);
                }
            }
            return dp[amount]== Integer.MAX_VALUE?-1:dp[amount];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
