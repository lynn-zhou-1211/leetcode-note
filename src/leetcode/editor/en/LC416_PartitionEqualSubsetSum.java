package src.leetcode.editor.en;

import java.util.Arrays;

public class LC416_PartitionEqualSubsetSum {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean canPartition(int[] nums) {
            // 背包容量 = target
            // 物品 = num:nums
            // weight = nums[i]
            // value = nums[i]
            int sum = 0;
            for (int num : nums) sum += num;
            if (sum % 2 != 0) return false;
            int target = sum / 2;

//            int[] dp = new int[target + 1];  // 看背包装满时容量是不是target
//            for (int num : nums) {
//                for (int j = target; j >= num; j--) {
//                    // 不放当前num，和上一轮循环一样
//                    // 放当前num，先腾出num的空间，再存
//                    dp[j] = Math.max(dp[j], dp[j - num] + num);
//                }
//            }
//            return dp[target]==target;
            boolean[] dp = new boolean[target + 1];
            dp[0] = true;

            for (int num : nums) {
                for (int j = target; j >= num; j--) {
                    // 只要有一个为 true，结果就是 true
                    dp[j] = dp[j] || dp[j - num];
                }
            }
            return dp[target];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
