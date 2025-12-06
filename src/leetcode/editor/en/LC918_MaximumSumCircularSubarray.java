package src.leetcode.editor.en;

public class LC918_MaximumSumCircularSubarray{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        // 正常
        // 中间挖掉一块最小值
        int totalSum = 0;
        int currMax = 0;
        int currMin =0;
        int maxKadane = nums[0];
        int minKadane = nums[0];
        for (int x : nums) {
            // max
            currMax= Math.max(x,currMax+x);
            maxKadane= Math.max(currMax, maxKadane);
            // min
            currMin = Math.min(x,currMin+x);
            minKadane = Math.min(currMin,minKadane);
            // total
            totalSum+=x;

        }
        if(maxKadane<0) return maxKadane;
        return Math.max(maxKadane,totalSum-minKadane);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
