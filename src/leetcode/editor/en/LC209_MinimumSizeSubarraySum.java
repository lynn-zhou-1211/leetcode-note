package src.leetcode.editor.en;

import java.util.List;

public class LC209_MinimumSizeSubarraySum {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int left = 0;
            int right = 0;
            int sum = 0;
            int minLen = Integer.MAX_VALUE;
            while(right<nums.length){
                sum+=nums[right];
                while (sum>=target){
                    minLen=Math.min(minLen,right-left+1);
                    sum-=nums[left];
                    left++;
                }
                right++;
            }

            return minLen==Integer.MAX_VALUE?0:minLen;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
