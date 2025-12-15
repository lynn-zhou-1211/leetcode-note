package src.leetcode.editor.en;

import java.util.Arrays;

public class LC322_CoinChange {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int coinChange(int[] coins, int amount) {
            // i：amount
            // 外层循环：遍历每一个金额 i (从小到大)
            // 内层循环：自底向上遍历每一个金额，对于每一个金额，尝试减去所有可能的硬币面值，找到之前的最小步数加一
            int[] dp = new int[amount+1];
            Arrays.fill(dp, amount + 1);
            dp[0] = 0;

            for (int i = 1; i <= amount; i++) {
                for (int coin : coins) {
                    if (coin <= i) {
                        dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                    }
                }
            }
            return dp[amount] > amount ? -1 : dp[amount];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
