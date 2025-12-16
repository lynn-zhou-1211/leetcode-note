package src.leetcode.editor.en;

public class LC377_CombinationSumIv{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int combinationSum4(int[] nums, int target) {
        // dp[j]= dp[j] + dp[j-num]
        //   不选num,同上一轮  选num，腾出空间
        //        0  1  2  3  4
        // num=1  0  1  1  1  1
        // num=2  0  1  1  2  2
        int[] dp = new int[target+1];
        dp[0]=0;
        for (int num : nums) {
            for (int j = 0; j <=target; j++) {
                if(j>=num) dp[j]+=dp[j-num];
            }
        }
        return dp[target];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
