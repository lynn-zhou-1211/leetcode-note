package src.leetcode.editor.en;

import java.util.Arrays;

public class LC300_LongestIncreasingSubsequence {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLIS(int[] nums) {
            if (nums.length == 0) return 0;
            //   dp[i]: 以nums[i]结尾的最长字串
            //   最后一个数字已经固定，问题变成：
            //      在这个数字之前，我能找到的最好的倒数第二个数字是谁？
            int n = nums.length;
            int[] dp = new int[n];
            //每个数字本身至少是一个长度为 1 的子序列。所以 dp 数组必须全部初始化为 1
            Arrays.fill(dp, 1);
            int max = 1;
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (nums[i] > nums[j]) dp[i] = Math.max(dp[i], dp[j] + 1);
                }
                max = Math.max(max, dp[i]);
            }
            return max;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
