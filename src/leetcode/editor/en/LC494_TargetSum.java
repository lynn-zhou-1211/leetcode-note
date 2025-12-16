package src.leetcode.editor.en;

public class LC494_TargetSum {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findTargetSumWays(int[] nums, int target) {
            // 问最大价值 (LC 416)：dp[j] = max(dp[j], dp[j-w] + v)
            // 问方案数 (LC 494)：dp[j] = dp[j] + dp[j-w]
            // 容量=(sum+target)/2
            int sum = 0;
            for (int num : nums) sum += num;

            target=Math.abs(target);
            if ((sum + target) % 2 != 0) return 0;

            int capacity = (sum + target) / 2;

            int[] dp = new int[capacity + 1];
            dp[0] = 1;
            for (int num : nums) {
                for (int j = capacity; j >= 0; j--) {
                    if (j >= num) dp[j] = dp[j] + dp[j - num];
                }
            }
            return dp[capacity];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
