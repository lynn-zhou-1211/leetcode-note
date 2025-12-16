package src.leetcode.editor.en;

public class LC746_MinCostClimbingStairs{
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        // 楼顶 (Target) 并不是数组的最后一个位置 n-1，而是 n (数组之外的那一步)。
        public int minCostClimbingStairs(int[] cost) {
            int n = cost.length;
            // dp 数组长度为 n + 1，因为我们要走到楼顶 n
            int[] dp = new int[n + 1];

            // 初始化：允许直接站在 0 或 1 上，初始花费为 0
            dp[0] = 0;
            dp[1] = 0;

            // 从第 2 级开始计算，一直算到 n
            for (int i = 2; i <= n; i++) {
                // 状态转移：前一步的总花费 + 前一步那级台阶的过路费
                dp[i] = Math.min(dp[i - 1] + cost[i - 1],
                        dp[i - 2] + cost[i - 2]);
            }

            // 返回到达楼顶的最小花费
            return dp[n];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
