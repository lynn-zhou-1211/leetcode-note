package src.leetcode.editor.en;

public class LC198_HouseRobber {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int rob(int[] nums) {
            // 相邻约束：当前这一步选了，下一步就不能选
            // dp: 当前最大值

            // 边缘条件：长度是1
            int n = nums.length;
            if (n == 1) return nums[0];


            int[] dp = new int[n];
            dp[0] = nums[0];
            dp[1] = Math.max(nums[0], nums[1]);

            for (int i = 2; i < n; i++) {
                dp[i]= Math.max(dp[i-1],dp[i-2]+nums[i]);
            }
            return dp[n-1];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
