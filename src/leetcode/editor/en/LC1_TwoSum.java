package src.leetcode.editor.en;

import java.util.Arrays;

public class LC1_TwoSum{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(nums[i]+nums[j]==target) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
