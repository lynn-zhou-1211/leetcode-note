package src.leetcode.editor.en;

public class LC198_HouseRobber{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        // 对每一栋房子有偷或不偷
        if(n==1) return nums[0];
        int[] dp = new int[n];

        dp[0]=nums[0];
        dp[1]= Math.max(nums[0],nums[1]);
        for (int i = 2; i < n; i++) {
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[n-1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
