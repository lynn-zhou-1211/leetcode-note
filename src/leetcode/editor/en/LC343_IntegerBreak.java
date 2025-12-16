package src.leetcode.editor.en;

public class LC343_IntegerBreak {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int integerBreak(int n) {
            // 选择一段j，剩下的 i-j 继续切分
            int[] dp = new int[n + 1];
            dp[2] = 1;

            for (int i = 3; i <= n; i++) {
                for (int j = 1; j <= i / 2; j++) {
                    // 核心状态转移
                    // 1. 之前计算过的最大值 dp[i]
                    // 2. 切两段：j * (i-j)
                    // 3. 切多段：j * dp[i-j]
                    dp[i] = Math.max(dp[i],Math.max(j * (i - j), j * dp[i - j]));
                }
            }
            return dp[n];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
