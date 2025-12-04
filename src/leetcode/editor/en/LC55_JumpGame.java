package src.leetcode.editor.en;

public class LC55_JumpGame{
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean canJump(int[] nums) {
            int reachable = 0;
            for (int i = 0; i < nums.length; i++) {
                if (i > reachable) return false;
                reachable = Math.max(reachable, i + nums[i]);
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
