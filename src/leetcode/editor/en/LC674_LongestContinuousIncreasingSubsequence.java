package src.leetcode.editor.en;

public class LC674_LongestContinuousIncreasingSubsequence{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        // dp[i]:以i结尾的最长长度
        int n = nums.length;
        int[] dp = new int[n];
        dp[0]=1;
        int max =1;
        for (int i = 1; i < n; i++) {
            if(nums[i]>nums[i-1]) dp[i]=dp[i-1]+1;
            else dp[i]=1;
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
